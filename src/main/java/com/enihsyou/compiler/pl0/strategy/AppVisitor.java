package com.enihsyou.compiler.pl0.strategy;

import com.enihsyou.compiler.pl0.antlr.Pl0BaseVisitor;
import com.enihsyou.compiler.pl0.app.AppWindow;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.table.DefaultTableModel;

public class AppVisitor extends Pl0BaseVisitor<Void> {

    private AppWindow parent;

    private DefaultTableModel table;

    public AppVisitor(AppWindow parent) {
        this.parent = parent;
        table = parent.getLexerTable();
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        final Token symbol = node.getSymbol();
        System.out.println(symbol);

        final int index = symbol.getTokenIndex();
        final String position = "L" + symbol.getLine() + ':' + symbol.getCharPositionInLine();
        final String tokenGroup = parent.lexer.getVocabulary().getSymbolicName(symbol.getType());
        final String type = parent.lexer.getVocabulary().getDisplayName(symbol.getType());
        final String value = symbol.getText();

        table.addRow(new Object[]{index, position, tokenGroup, type, value});

        return super.visitTerminal(node);
    }
}
