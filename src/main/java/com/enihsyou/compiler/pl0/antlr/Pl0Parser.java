// Generated from D:/IntelliJProjects/PL0-Compiler/resource\Pl0.g4 by ANTLR 4.7

package com.enihsyou.compiler.pl0.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pl0Parser extends Parser {

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

    public static final int
        RULE_program               = 0,
        RULE_block                 = 1,
        RULE_const_declaration     = 2,
        RULE_var_declaration       = 3,
        RULE_procedure_declaration = 4,
        RULE_const_assigment       = 5,
        RULE_statement             = 6,
        RULE_condition             = 7,
        RULE_relation_op           = 8,
        RULE_expression            = 9,
        RULE_term                  = 10,
        RULE_factor                = 11;

    public static final String[] ruleNames = {
        "program",
        "block",
        "const_declaration",
        "var_declaration",
        "procedure_declaration",
        "const_assigment",
        "statement",
        "condition",
        "relation_op",
        "expression",
        "term",
        "factor"
    };

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a5\4\2\t\2\4" +
            "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
            "\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3\7\3%" +
            "\n\3\f\3\16\3(\13\3\3\3\6\3+\n\3\r\3\16\3,\3\4\3\4\3\4\3\4\7\4\63\n\4" +
            "\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5" +
            "\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3" +
            "\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b" +
            "e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\b" +
            "\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t" +
            "\5\t\u0086\n\t\3\n\3\n\3\13\5\13\u008b\n\13\3\13\3\13\3\13\7\13\u0090" +
            "\n\13\f\13\16\13\u0093\13\13\3\f\3\f\3\f\7\f\u0098\n\f\f\f\16\f\u009b" +
            "\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\2\2\16\2\4\6\b\n\f\16" +
            "\20\22\24\26\30\2\5\3\2\7\f\3\2\r\16\3\2\17\20\2\u00ae\2\32\3\2\2\2\4" +
            "\36\3\2\2\2\6.\3\2\2\2\b9\3\2\2\2\nD\3\2\2\2\fJ\3\2\2\2\16}\3\2\2\2\20" +
            "\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u008a\3\2\2\2\26\u0094\3\2\2\2\30\u00a2" +
            "\3\2\2\2\32\33\5\4\3\2\33\34\7\3\2\2\34\3\3\2\2\2\35\37\5\6\4\2\36\35" +
            "\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\5\b\5\2! \3\2\2\2!\"\3\2\2\2\"&" +
            "\3\2\2\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2" +
            "(&\3\2\2\2)+\5\16\b\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2" +
            "\2./\7\23\2\2/\64\5\f\7\2\60\61\7\4\2\2\61\63\5\f\7\2\62\60\3\2\2\2\63" +
            "\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67" +
            "8\7\5\2\28\7\3\2\2\29:\7\24\2\2:?\7\"\2\2;<\7\4\2\2<>\7\"\2\2=;\3\2\2" +
            "\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\5\2\2C\t\3\2" +
            "\2\2DE\7\36\2\2EF\7\"\2\2FG\7\5\2\2GH\5\4\3\2HI\7\5\2\2I\13\3\2\2\2JK" +
            "\7\"\2\2KL\7\13\2\2LM\7#\2\2M\r\3\2\2\2NO\7\"\2\2OP\7\6\2\2P~\5\24\13" +
            "\2QR\7\35\2\2R~\7\"\2\2ST\7\26\2\2TY\5\16\b\2UV\7\5\2\2VX\5\16\b\2WU\3" +
            "\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\27\2\2" +
            "]~\3\2\2\2^_\7\30\2\2_`\5\20\t\2`a\7\31\2\2ad\5\16\b\2bc\7\32\2\2ce\5" +
            "\16\b\2db\3\2\2\2de\3\2\2\2e~\3\2\2\2fg\7\33\2\2gh\5\20\t\2hi\7\34\2\2" +
            "ij\5\16\b\2j~\3\2\2\2kl\7\37\2\2lq\7\"\2\2mn\7\4\2\2np\7\"\2\2om\3\2\2" +
            "\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r~\3\2\2\2sq\3\2\2\2tu\7 \2\2uz\5\24\13" +
            "\2vw\7\4\2\2wy\5\24\13\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2" +
            "\2\2|z\3\2\2\2}N\3\2\2\2}Q\3\2\2\2}S\3\2\2\2}^\3\2\2\2}f\3\2\2\2}k\3\2" +
            "\2\2}t\3\2\2\2~\17\3\2\2\2\177\u0080\5\24\13\2\u0080\u0081\5\22\n\2\u0081" +
            "\u0082\5\24\13\2\u0082\u0086\3\2\2\2\u0083\u0084\7\25\2\2\u0084\u0086" +
            "\5\24\13\2\u0085\177\3\2\2\2\u0085\u0083\3\2\2\2\u0086\21\3\2\2\2\u0087" +
            "\u0088\t\2\2\2\u0088\23\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2" +
            "\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0091\5\26\f\2\u008d" +
            "\u008e\t\3\2\2\u008e\u0090\5\26\f\2\u008f\u008d\3\2\2\2\u0090\u0093\3" +
            "\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093" +
            "\u0091\3\2\2\2\u0094\u0099\5\30\r\2\u0095\u0096\t\4\2\2\u0096\u0098\5" +
            "\30\r\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099" +
            "\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a3\7\"\2" +
            "\2\u009d\u00a3\7#\2\2\u009e\u009f\7\21\2\2\u009f\u00a0\5\24\13\2\u00a0" +
            "\u00a1\7\22\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3" +
            "\2\2\2\u00a2\u009e\3\2\2\2\u00a3\31\3\2\2\2\22\36!&,\64?Ydqz}\u0085\u008a" +
            "\u0091\u0099\u00a2";

    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    protected static final DFA[] _decisionToDFA;

    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();

    private static final String[] _LITERAL_NAMES = {
        null, "'.'", "','", "';'", "':='", "'<'", "'<='", "'>'", "'>='", "'='",
        "'#'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'const'", null, "'odd'",
        "'begin'", "'end'", "'if'", "'then'", "'else'", "'while'", "'do'", "'call'",
        "'procedure'", "'read'", "'write'"
    };

    private static final String[] _SYMBOLIC_NAMES = {
        null, "DOT", "COMMA", "SEMICOLON", "ASSIGN_OP", "LESS_THAN", "LESS_EQUAL",
        "GREATER_THAN", "GREATER_EQUAL", "EQUALS", "DIAMOND", "PLUS", "MINUS",
        "TIMES", "OVER", "LPAREN", "RPAREN", "CONST", "INT_DECLARATION", "ODD",
        "BEGIN", "END", "IF", "THEN", "ELSE", "WHILE", "DO", "CALL", "PROCEDURE",
        "IN", "OUT", "WS", "IDENTIFER", "INTEGER"
    };

    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public Pl0Parser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
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

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(24);
                block();
                setState(25);
                match(DOT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(28);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CONST) {
                    {
                        setState(27);
                        const_declaration();
                    }
                }

                setState(31);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INT_DECLARATION) {
                    {
                        setState(30);
                        var_declaration();
                    }
                }

                setState(36);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PROCEDURE) {
                    {
                        {
                            setState(33);
                            procedure_declaration();
                        }
                    }
                    setState(38);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(40);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(39);
                            statement();
                        }
                    }
                    setState(42);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) &
                        ((1L << BEGIN) |
                            (1L << IF) |
                            (1L << WHILE) |
                            (1L << CALL) |
                            (1L << IN) |
                            (1L << OUT) |
                            (1L << IDENTIFER))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Const_declarationContext const_declaration() throws RecognitionException {
        Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_const_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                match(CONST);
                setState(45);
                const_assigment();
                setState(50);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(46);
                            match(COMMA);
                            setState(47);
                            const_assigment();
                        }
                    }
                    setState(52);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(53);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_declarationContext var_declaration() throws RecognitionException {
        Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_var_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(55);
                match(INT_DECLARATION);
                setState(56);
                match(IDENTIFER);
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(57);
                            match(COMMA);
                            setState(58);
                            match(IDENTIFER);
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(64);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
        Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_procedure_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                match(PROCEDURE);
                setState(67);
                match(IDENTIFER);
                setState(68);
                match(SEMICOLON);
                setState(69);
                block();
                setState(70);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Const_assigmentContext const_assigment() throws RecognitionException {
        Const_assigmentContext _localctx = new Const_assigmentContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_const_assigment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
                match(IDENTIFER);
                setState(73);
                match(EQUALS);
                setState(74);
                match(INTEGER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_statement);
        int _la;
        try {
            setState(123);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(76);
                    match(IDENTIFER);
                    setState(77);
                    match(ASSIGN_OP);
                    setState(78);
                    expression();
                }
                break;
                case CALL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(79);
                    match(CALL);
                    setState(80);
                    match(IDENTIFER);
                }
                break;
                case BEGIN:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(81);
                    match(BEGIN);
                    setState(82);
                    statement();
                    setState(87);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == SEMICOLON) {
                        {
                            {
                                setState(83);
                                match(SEMICOLON);
                                setState(84);
                                statement();
                            }
                        }
                        setState(89);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(90);
                    match(END);
                }
                break;
                case IF:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(92);
                    match(IF);
                    setState(93);
                    condition();
                    setState(94);
                    match(THEN);
                    setState(95);
                    statement();
                    setState(98);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                        case 1: {
                            setState(96);
                            match(ELSE);
                            setState(97);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(100);
                    match(WHILE);
                    setState(101);
                    condition();
                    setState(102);
                    match(DO);
                    setState(103);
                    statement();
                }
                break;
                case IN:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(105);
                    match(IN);
                    setState(106);
                    match(IDENTIFER);
                    setState(111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(107);
                                match(COMMA);
                                setState(108);
                                match(IDENTIFER);
                            }
                        }
                        setState(113);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case OUT:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(114);
                    match(OUT);
                    setState(115);
                    expression();
                    setState(120);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(116);
                                match(COMMA);
                                setState(117);
                                expression();
                            }
                        }
                        setState(122);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConditionContext condition() throws RecognitionException {
        ConditionContext _localctx = new ConditionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_condition);
        try {
            setState(131);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case PLUS:
                case MINUS:
                case LPAREN:
                case IDENTIFER:
                case INTEGER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(125);
                    expression();
                    setState(126);
                    relation_op();
                    setState(127);
                    expression();
                }
                break;
                case ODD:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(129);
                    match(ODD);
                    setState(130);
                    expression();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Relation_opContext relation_op() throws RecognitionException {
        Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_relation_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(133);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) &
                        ((1L << LESS_THAN) |
                            (1L << LESS_EQUAL) |
                            (1L << GREATER_THAN) |
                            (1L << GREATER_EQUAL) |
                            (1L << EQUALS) |
                            (1L << DIAMOND))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(136);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PLUS || _la == MINUS) {
                    {
                        setState(135);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(138);
                term();
                setState(143);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PLUS || _la == MINUS) {
                    {
                        {
                            setState(139);
                            _la = _input.LA(1);
                            if (!(_la == PLUS || _la == MINUS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(140);
                            term();
                        }
                    }
                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_term);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                factor();
                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TIMES || _la == OVER) {
                    {
                        {
                            setState(147);
                            _la = _input.LA(1);
                            if (!(_la == TIMES || _la == OVER)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(148);
                            factor();
                        }
                    }
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FactorContext factor() throws RecognitionException {
        FactorContext _localctx = new FactorContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_factor);
        try {
            setState(160);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(154);
                    match(IDENTIFER);
                }
                break;
                case INTEGER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(155);
                    match(INTEGER);
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(156);
                    match(LPAREN);
                    setState(157);
                    expression();
                    setState(158);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgramContext extends ParserRuleContext {

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode DOT() { return getToken(Pl0Parser.DOT, 0); }

        @Override
        public int getRuleIndex() { return RULE_program; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Const_declarationContext const_declaration() {
            return getRuleContext(Const_declarationContext.class, 0);
        }

        public Var_declarationContext var_declaration() {
            return getRuleContext(Var_declarationContext.class, 0);
        }

        public List<Procedure_declarationContext> procedure_declaration() {
            return getRuleContexts(Procedure_declarationContext.class);
        }

        public Procedure_declarationContext procedure_declaration(int i) {
            return getRuleContext(Procedure_declarationContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() { return RULE_block; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Const_declarationContext extends ParserRuleContext {

        public Const_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CONST() { return getToken(Pl0Parser.CONST, 0); }

        public List<Const_assigmentContext> const_assigment() {
            return getRuleContexts(Const_assigmentContext.class);
        }

        public Const_assigmentContext const_assigment(int i) {
            return getRuleContext(Const_assigmentContext.class, i);
        }

        public TerminalNode SEMICOLON() { return getToken(Pl0Parser.SEMICOLON, 0); }

        public List<TerminalNode> COMMA() { return getTokens(Pl0Parser.COMMA); }

        public TerminalNode COMMA(int i) {
            return getToken(Pl0Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex() { return RULE_const_declaration; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitConst_declaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Var_declarationContext extends ParserRuleContext {

        public Var_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT_DECLARATION() { return getToken(Pl0Parser.INT_DECLARATION, 0); }

        public List<TerminalNode> IDENTIFER() { return getTokens(Pl0Parser.IDENTIFER); }

        public TerminalNode IDENTIFER(int i) {
            return getToken(Pl0Parser.IDENTIFER, i);
        }

        public TerminalNode SEMICOLON() { return getToken(Pl0Parser.SEMICOLON, 0); }

        public List<TerminalNode> COMMA() { return getTokens(Pl0Parser.COMMA); }

        public TerminalNode COMMA(int i) {
            return getToken(Pl0Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex() { return RULE_var_declaration; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitVar_declaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Procedure_declarationContext extends ParserRuleContext {

        public Procedure_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PROCEDURE() { return getToken(Pl0Parser.PROCEDURE, 0); }

        public TerminalNode IDENTIFER() { return getToken(Pl0Parser.IDENTIFER, 0); }

        public List<TerminalNode> SEMICOLON() { return getTokens(Pl0Parser.SEMICOLON); }

        public TerminalNode SEMICOLON(int i) {
            return getToken(Pl0Parser.SEMICOLON, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() { return RULE_procedure_declaration; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor)
                return ((Pl0Visitor<? extends T>) visitor).visitProcedure_declaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Const_assigmentContext extends ParserRuleContext {

        public Const_assigmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFER() { return getToken(Pl0Parser.IDENTIFER, 0); }

        public TerminalNode EQUALS() { return getToken(Pl0Parser.EQUALS, 0); }

        public TerminalNode INTEGER() { return getToken(Pl0Parser.INTEGER, 0); }

        @Override
        public int getRuleIndex() { return RULE_const_assigment; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitConst_assigment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENTIFER() { return getTokens(Pl0Parser.IDENTIFER); }

        public TerminalNode IDENTIFER(int i) {
            return getToken(Pl0Parser.IDENTIFER, i);
        }

        public TerminalNode ASSIGN_OP() { return getToken(Pl0Parser.ASSIGN_OP, 0); }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode CALL() { return getToken(Pl0Parser.CALL, 0); }

        public TerminalNode BEGIN() { return getToken(Pl0Parser.BEGIN, 0); }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public TerminalNode END() { return getToken(Pl0Parser.END, 0); }

        public List<TerminalNode> SEMICOLON() { return getTokens(Pl0Parser.SEMICOLON); }

        public TerminalNode SEMICOLON(int i) {
            return getToken(Pl0Parser.SEMICOLON, i);
        }

        public TerminalNode IF() { return getToken(Pl0Parser.IF, 0); }

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public TerminalNode THEN() { return getToken(Pl0Parser.THEN, 0); }

        public TerminalNode ELSE() { return getToken(Pl0Parser.ELSE, 0); }

        public TerminalNode WHILE() { return getToken(Pl0Parser.WHILE, 0); }

        public TerminalNode DO() { return getToken(Pl0Parser.DO, 0); }

        public TerminalNode IN() { return getToken(Pl0Parser.IN, 0); }

        public List<TerminalNode> COMMA() { return getTokens(Pl0Parser.COMMA); }

        public TerminalNode COMMA(int i) {
            return getToken(Pl0Parser.COMMA, i);
        }

        public TerminalNode OUT() { return getToken(Pl0Parser.OUT, 0); }

        @Override
        public int getRuleIndex() { return RULE_statement; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConditionContext extends ParserRuleContext {

        public ConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public Relation_opContext relation_op() {
            return getRuleContext(Relation_opContext.class, 0);
        }

        public TerminalNode ODD() { return getToken(Pl0Parser.ODD, 0); }

        @Override
        public int getRuleIndex() { return RULE_condition; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitCondition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Relation_opContext extends ParserRuleContext {

        public Relation_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EQUALS() { return getToken(Pl0Parser.EQUALS, 0); }

        public TerminalNode DIAMOND() { return getToken(Pl0Parser.DIAMOND, 0); }

        public TerminalNode LESS_THAN() { return getToken(Pl0Parser.LESS_THAN, 0); }

        public TerminalNode LESS_EQUAL() { return getToken(Pl0Parser.LESS_EQUAL, 0); }

        public TerminalNode GREATER_THAN() { return getToken(Pl0Parser.GREATER_THAN, 0); }

        public TerminalNode GREATER_EQUAL() { return getToken(Pl0Parser.GREATER_EQUAL, 0); }

        @Override
        public int getRuleIndex() { return RULE_relation_op; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitRelation_op(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public List<TerminalNode> PLUS() { return getTokens(Pl0Parser.PLUS); }

        public TerminalNode PLUS(int i) {
            return getToken(Pl0Parser.PLUS, i);
        }

        public List<TerminalNode> MINUS() { return getTokens(Pl0Parser.MINUS); }

        public TerminalNode MINUS(int i) {
            return getToken(Pl0Parser.MINUS, i);
        }

        @Override
        public int getRuleIndex() { return RULE_expression; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TermContext extends ParserRuleContext {

        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<FactorContext> factor() {
            return getRuleContexts(FactorContext.class);
        }

        public FactorContext factor(int i) {
            return getRuleContext(FactorContext.class, i);
        }

        public List<TerminalNode> TIMES() { return getTokens(Pl0Parser.TIMES); }

        public TerminalNode TIMES(int i) {
            return getToken(Pl0Parser.TIMES, i);
        }

        public List<TerminalNode> OVER() { return getTokens(Pl0Parser.OVER); }

        public TerminalNode OVER(int i) {
            return getToken(Pl0Parser.OVER, i);
        }

        @Override
        public int getRuleIndex() { return RULE_term; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FactorContext extends ParserRuleContext {

        public FactorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFER() { return getToken(Pl0Parser.IDENTIFER, 0); }

        public TerminalNode INTEGER() { return getToken(Pl0Parser.INTEGER, 0); }

        public TerminalNode LPAREN() { return getToken(Pl0Parser.LPAREN, 0); }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() { return getToken(Pl0Parser.RPAREN, 0); }

        @Override
        public int getRuleIndex() { return RULE_factor; }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof Pl0Visitor) return ((Pl0Visitor<? extends T>) visitor).visitFactor(this);
            else return visitor.visitChildren(this);
        }
    }
}
