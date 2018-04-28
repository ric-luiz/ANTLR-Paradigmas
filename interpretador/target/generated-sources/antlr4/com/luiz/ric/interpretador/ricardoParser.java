// Generated from ricardo.g4 by ANTLR 4.4
package com.luiz.ric.interpretador;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ricardoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MENOS=5, MULT=6, DIV=7, AND=8, OR=9, 
		NOT=10, GT=11, LT=12, GTQ=13, LTQ=14, EQ=15, NEQ=16, ASSIGN=17, BRACKETS_OPEN=18, 
		BRACKETS_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ID=23, NUMBER=24, 
		WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"'{'", "'}'", "'('", "')'", "';'", "ID", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentece = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4;
	public static final String[] ruleNames = {
		"program", "sentece", "var_decl", "var_assign", "println"
	};

	@Override
	public String getGrammarFileName() { return "ricardo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ricardoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ricardoParser.ID, 0); }
		public List<SenteceContext> sentece() {
			return getRuleContexts(SenteceContext.class);
		}
		public TerminalNode BRACKETS_OPEN() { return getToken(ricardoParser.BRACKETS_OPEN, 0); }
		public SenteceContext sentece(int i) {
			return getRuleContext(SenteceContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(ricardoParser.PROGRAM, 0); }
		public TerminalNode BRACKETS_CLOSE() { return getToken(ricardoParser.BRACKETS_CLOSE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(PROGRAM);
			setState(11); match(ID);
			setState(12); match(BRACKETS_OPEN);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(13); sentece();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19); match(BRACKETS_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenteceContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SenteceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).enterSentece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).exitSentece(this);
		}
	}

	public final SenteceContext sentece() throws RecognitionException {
		SenteceContext _localctx = new SenteceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentece);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(23); println();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ricardoParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ricardoParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(ricardoParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(VAR);
			setState(27); match(ID);
			setState(28); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ricardoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ricardoParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ricardoParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(ricardoParser.NUMBER, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(ID);
			setState(31); match(ASSIGN);
			setState(32); match(NUMBER);
			setState(33); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ricardoParser.SEMICOLON, 0); }
		public TerminalNode PRINTLN() { return getToken(ricardoParser.PRINTLN, 0); }
		public TerminalNode NUMBER() { return getToken(ricardoParser.NUMBER, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ricardoListener ) ((ricardoListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(PRINTLN);
			setState(36); match(NUMBER);
			setState(37); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\'\2\f\3\2\2\2\4\32\3\2\2\2\6\34"+
		"\3\2\2\2\b \3\2\2\2\n%\3\2\2\2\f\r\7\3\2\2\r\16\7\31\2\2\16\22\7\24\2"+
		"\2\17\21\5\4\3\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2"+
		"\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\7\25\2\2\26\3\3\2\2\2\27\33\5\6\4"+
		"\2\30\33\5\b\5\2\31\33\5\n\6\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2"+
		"\2\33\5\3\2\2\2\34\35\7\4\2\2\35\36\7\31\2\2\36\37\7\30\2\2\37\7\3\2\2"+
		"\2 !\7\31\2\2!\"\7\23\2\2\"#\7\32\2\2#$\7\30\2\2$\t\3\2\2\2%&\7\5\2\2"+
		"&\'\7\32\2\2\'(\7\30\2\2(\13\3\2\2\2\4\22\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}