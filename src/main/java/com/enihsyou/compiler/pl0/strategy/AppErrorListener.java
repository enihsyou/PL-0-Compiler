package com.enihsyou.compiler.pl0.strategy;

import com.enihsyou.compiler.pl0.app.AppWindow;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class AppErrorListener extends BaseErrorListener {

    private AppWindow parent;

    public AppErrorListener(AppWindow parent) {
        this.parent = parent;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        final String errorMessage = "L" + line + ':' + charPositionInLine + "字符发生错误 " + msg;
        parent.printErrorCode(errorMessage);
    }
}
