// Generated from D:/IntelliJProjects/PL0-Compiler/resource\Pl0.g4 by ANTLR 4.7

package com.enihsyou.compiler.pl0.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pl0Lexer extends Lexer {

    public static final int
        DOT             = 1,
        COMMA           = 2,
        SEMICOLON       = 3,
        ASSIGN_OP       = 4,
        LESS_THAN       = 5,
        LESS_EQUAL      = 6,
        GREATER_THAN    = 7,
        GREATER_EQUAL   = 8,
        EQUALS          = 9,
        DIAMOND         = 10,
        PLUS            = 11,
        MINUS           = 12,
        TIMES           = 13,
        OVER            = 14,
        LPAREN          = 15,
        RPAREN          = 16,
        CONST           = 17,
        INT_DECLARATION = 18,
        ODD             = 19,
        BEGIN           = 20,
        END             = 21,
        IF              = 22,
        THEN            = 23,
        ELSE            = 24,
        WHILE           = 25,
        DO              = 26,
        CALL            = 27,
        PROCEDURE       = 28,
        IN              = 29,
        OUT             = 30,
        WS              = 31,
        IDENTIFER       = 32,
        INTEGER         = 33;

    public static final String[] ruleNames = {
        "DOT",
        "COMMA",
        "SEMICOLON",
        "ASSIGN_OP",
        "LESS_THAN",
        "LESS_EQUAL",
        "GREATER_THAN",
        "GREATER_EQUAL",
        "EQUALS",
        "DIAMOND",
        "PLUS",
        "MINUS",
        "TIMES",
        "OVER",
        "LPAREN",
        "RPAREN",
        "CONST",
        "INT_DECLARATION",
        "ODD",
        "BEGIN",
        "END",
        "IF",
        "THEN",
        "ELSE",
        "WHILE",
        "DO",
        "CALL",
        "PROCEDURE",
        "IN",
        "OUT",
        "WS",
        "IDENTIFER",
        "INTEGER",
        "Letter",
        "Digit"
    };

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00d0\b\1\4\2\t" +
            "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
            "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
            "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
            "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
            "\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3" +
            "\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16" +
            "\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23" +
            "\3\23\3\23\3\23\3\23\3\23\5\23y\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25" +
            "\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30" +
            "\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33" +
            "\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35" +
            "\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \6" +
            " \u00ba\n \r \16 \u00bb\3 \3 \3!\3!\3!\7!\u00c3\n!\f!\16!\u00c6\13!\3" +
            "\"\6\"\u00c9\n\"\r\"\16\"\u00ca\3#\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7" +
            "\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25" +
            ")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2\3\2\5" +
            "\5\2\13\f\16\17\"\"\5\2C\\aac|\3\2\62;\2\u00d2\2\3\3\2\2\2\2\5\3\2\2\2" +
            "\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3" +
            "\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2" +
            "\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2" +
            "\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2" +
            "\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2" +
            "\2\2\2A\3\2\2\2\2C\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2" +
            "\13R\3\2\2\2\rT\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25^\3\2\2" +
            "\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2" +
            "\2#l\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)~\3\2\2\2+\u0084\3\2\2\2-\u0088\3\2" +
            "\2\2/\u008b\3\2\2\2\61\u0090\3\2\2\2\63\u0095\3\2\2\2\65\u009b\3\2\2\2" +
            "\67\u009e\3\2\2\29\u00a3\3\2\2\2;\u00ad\3\2\2\2=\u00b2\3\2\2\2?\u00b9" +
            "\3\2\2\2A\u00bf\3\2\2\2C\u00c8\3\2\2\2E\u00cc\3\2\2\2G\u00ce\3\2\2\2I" +
            "J\7\60\2\2J\4\3\2\2\2KL\7.\2\2L\6\3\2\2\2MN\7=\2\2N\b\3\2\2\2OP\7<\2\2" +
            "PQ\7?\2\2Q\n\3\2\2\2RS\7>\2\2S\f\3\2\2\2TU\7>\2\2UV\7?\2\2V\16\3\2\2\2" +
            "WX\7@\2\2X\20\3\2\2\2YZ\7@\2\2Z[\7?\2\2[\22\3\2\2\2\\]\7?\2\2]\24\3\2" +
            "\2\2^_\7%\2\2_\26\3\2\2\2`a\7-\2\2a\30\3\2\2\2bc\7/\2\2c\32\3\2\2\2de" +
            "\7,\2\2e\34\3\2\2\2fg\7\61\2\2g\36\3\2\2\2hi\7*\2\2i \3\2\2\2jk\7+\2\2" +
            "k\"\3\2\2\2lm\7e\2\2mn\7q\2\2no\7p\2\2op\7u\2\2pq\7v\2\2q$\3\2\2\2rs\7" +
            "x\2\2st\7c\2\2ty\7t\2\2uv\7k\2\2vw\7p\2\2wy\7v\2\2xr\3\2\2\2xu\3\2\2\2" +
            "y&\3\2\2\2z{\7q\2\2{|\7f\2\2|}\7f\2\2}(\3\2\2\2~\177\7d\2\2\177\u0080" +
            "\7g\2\2\u0080\u0081\7i\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083" +
            "*\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7f\2\2\u0087" +
            ",\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a.\3\2\2\2\u008b\u008c" +
            "\7v\2\2\u008c\u008d\7j\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f" +
            "\60\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093" +
            "\u0094\7g\2\2\u0094\62\3\2\2\2\u0095\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097" +
            "\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\64\3\2\2\2\u009b" +
            "\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\66\3\2\2\2\u009e\u009f\7e\2\2\u009f" +
            "\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7n\2\2\u00a28\3\2\2\2\u00a3" +
            "\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7e\2\2" +
            "\u00a7\u00a8\7g\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab" +
            "\7t\2\2\u00ab\u00ac\7g\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af" +
            "\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7f\2\2\u00b1<\3\2\2\2\u00b2\u00b3" +
            "\7y\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7v\2\2\u00b6" +
            "\u00b7\7g\2\2\u00b7>\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba" +
            "\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2" +
            "\2\2\u00bd\u00be\b \2\2\u00be@\3\2\2\2\u00bf\u00c4\5E#\2\u00c0\u00c3\5" +
            "E#\2\u00c1\u00c3\5C\"\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3" +
            "\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5B\3\2\2\2" +
            "\u00c6\u00c4\3\2\2\2\u00c7\u00c9\5G$\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca" +
            "\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbD\3\2\2\2\u00cc" +
            "\u00cd\t\3\2\2\u00cdF\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cfH\3\2\2\2\b\2x" +
            "\u00bb\u00c2\u00c4\u00ca\3\2\3\2";

    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    protected static final DFA[] _decisionToDFA;

    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();

    private static final String[] _LITERAL_NAMES = {
        null,
        "'.'",
        "','",
        "';'",
        "':='",
        "'<'",
        "'<='",
        "'>'",
        "'>='",
        "'='",
        "'#'",
        "'+'",
        "'-'",
        "'*'",
        "'/'",
        "'('",
        "')'",
        "'const'",
        null,
        "'odd'",
        "'begin'",
        "'end'",
        "'if'",
        "'then'",
        "'else'",
        "'while'",
        "'do'",
        "'call'",
        "'procedure'",
        "'read'",
        "'write'"
    };

    private static final String[] _SYMBOLIC_NAMES = {
        null,
        "DOT",
        "COMMA",
        "SEMICOLON",
        "ASSIGN_OP",
        "LESS_THAN",
        "LESS_EQUAL",
        "GREATER_THAN",
        "GREATER_EQUAL",
        "EQUALS",
        "DIAMOND",
        "PLUS",
        "MINUS",
        "TIMES",
        "OVER",
        "LPAREN",
        "RPAREN",
        "CONST",
        "INT_DECLARATION",
        "ODD",
        "BEGIN",
        "END",
        "IF",
        "THEN",
        "ELSE",
        "WHILE",
        "DO",
        "CALL",
        "PROCEDURE",
        "IN",
        "OUT",
        "WS",
        "IDENTIFER",
        "INTEGER"
    };

    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public Pl0Lexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public String getGrammarFileName() { return "Pl0.g4"; }

    @Override
    public ATN getATN() { return _ATN; }

    @Override
    public String[] getChannelNames() { return channelNames; }

    @Override
    public String[] getModeNames() { return modeNames; }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }
}
