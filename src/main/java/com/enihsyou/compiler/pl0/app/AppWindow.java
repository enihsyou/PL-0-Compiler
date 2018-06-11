package com.enihsyou.compiler.pl0.app;

import com.enihsyou.compiler.pl0.antlr.Pl0Lexer;
import com.enihsyou.compiler.pl0.antlr.Pl0Parser;
import com.enihsyou.compiler.pl0.antlr.Pl0Parser.ProgramContext;
import com.enihsyou.compiler.pl0.strategy.AppErrorListener;
import com.enihsyou.compiler.pl0.strategy.AppErrorStrategy;
import com.enihsyou.compiler.pl0.strategy.AppVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class AppWindow {

    public static final String[] COLUMN_NAMES = new String[]{"序号", "位置", "使用规则", "类型", "值"};

    public Pl0Lexer lexer;

    public Pl0Parser parser;

    private JPanel mainPanel;

    private JTextArea codeEditor;

    private JTextArea errorPanel;

    private JTree syntaxTree;

    private JTable lexerPanel;

    private JTabbedPane tabbedPanel;

    private JButton compileButton;

    private JScrollPane editorScrollPanel;

    public AppWindow() {
        compileButton.addActionListener(e -> insertSyntaxTree(getCodeDocument()));
        final LineNumberComponent lineNumberComponent = new LineNumberComponent(new LineNumberModel() {
            @Override
            public int getNumberLines() {
                return codeEditor.getLineCount();
            }

            @Override
            public Rectangle getLineRect(int line) {
                try {
                    return codeEditor.modelToView(codeEditor.getLineStartOffset(line));
                } catch (BadLocationException e) {
                    e.printStackTrace();
                    return new Rectangle();
                }
            }
        });
        editorScrollPanel.setRowHeaderView(lineNumberComponent);
        codeEditor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                lineNumberComponent.adjustWidth();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                lineNumberComponent.adjustWidth();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                lineNumberComponent.adjustWidth();
            }
        });
    }

    public void insertSyntaxTree(String codeDocument) {
        clearErrorCode();
        clearLexerResult();
        if (codeDocument.isEmpty()) return;

        lexer = new Pl0Lexer(CharStreams.fromString(codeDocument));
        parser = new Pl0Parser(new CommonTokenStream(lexer));
        parser.setErrorHandler(new AppErrorStrategy());
        parser.addErrorListener(new AppErrorListener(this));

        final ProgramContext program = parser.program();
        if (errorPanel.getText().isEmpty()) {
            errorPanel.setForeground(new Color(25, 82, 29));
            errorPanel.setText("语法正常");
        } else {
            errorPanel.setForeground(new Color(148, 38, 55));
        }
        System.out.println(program.toStringTree());
        program.accept(new AppVisitor(this));

    }

    public String getCodeDocument() {
        return codeEditor.getText();
    }

    public void clearErrorCode() {
        errorPanel.setText("");
    }

    public void clearLexerResult() {
        getLexerTable().setRowCount(0);
    }

    public DefaultTableModel getLexerTable() {
        return ((DefaultTableModel) lexerPanel.getModel());
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[1].getClassName());
        } catch (Exception ignored) {
        }

        JFrame frame = new JFrame("PL/0 编译器");
        frame.setContentPane(new AppWindow().mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void printErrorCode(String errorMessage) {
        errorPanel.append(errorMessage + '\n');
    }

    private void createUIComponents() {

        //noinspection AnonymousInnerClassMayBeStatic
        DefaultTableModel tableModel = new DefaultTableModel(COLUMN_NAMES, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        lexerPanel = new JTable(tableModel);
    }
}
