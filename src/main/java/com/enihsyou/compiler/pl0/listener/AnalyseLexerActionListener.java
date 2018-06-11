package com.enihsyou.compiler.pl0.listener;

import com.enihsyou.compiler.pl0.app.AppWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AnalyseLexerActionListener extends AbstractAction {

    private AppWindow parent;

    public AnalyseLexerActionListener(AppWindow parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.clearErrorCode();
        parent.insertSyntaxTree(parent.getCodeDocument());
    }
}
