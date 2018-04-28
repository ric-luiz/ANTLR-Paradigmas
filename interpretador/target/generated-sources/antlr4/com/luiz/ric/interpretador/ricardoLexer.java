// Generated from ricardo.g4 by ANTLR 4.4
package com.luiz.ric.interpretador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ricardoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MENOS=5, MULT=6, DIV=7, AND=8, OR=9, 
		NOT=10, GT=11, LT=12, GTQ=13, LTQ=14, EQ=15, NEQ=16, ASSIGN=17, BRACKETS_OPEN=18, 
		BRACKETS_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ID=23, NUMBER=24, 
		WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "PRINTLN", "PLUS", "MENOS", "MULT", "DIV", "AND", "OR", 
		"NOT", "GT", "LT", "GTQ", "LTQ", "EQ", "NEQ", "ASSIGN", "BRACKETS_OPEN", 
		"BRACKETS_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
		"WS"
	};


	public ricardoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ricardo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\7\30x\n\30\f\30\16\30{\13\30\3\31\3\31\3"+
		"\32\6\32\u0080\n\32\r\32\16\32\u0081\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2"+
		"\5=\3\2\2\2\7A\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21"+
		"Q\3\2\2\2\23T\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2"+
		"\35`\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)o\3"+
		"\2\2\2+q\3\2\2\2-s\3\2\2\2/u\3\2\2\2\61|\3\2\2\2\63\177\3\2\2\2\65\66"+
		"\7r\2\2\66\67\7t\2\2\678\7q\2\289\7i\2\29:\7t\2\2:;\7c\2\2;<\7o\2\2<\4"+
		"\3\2\2\2=>\7x\2\2>?\7c\2\2?@\7t\2\2@\6\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7k"+
		"\2\2DE\7p\2\2EF\7v\2\2FG\7n\2\2GH\7p\2\2H\b\3\2\2\2IJ\7-\2\2J\n\3\2\2"+
		"\2KL\7/\2\2L\f\3\2\2\2MN\7,\2\2N\16\3\2\2\2OP\7\61\2\2P\20\3\2\2\2QR\7"+
		"(\2\2RS\7(\2\2S\22\3\2\2\2TU\7~\2\2UV\7~\2\2V\24\3\2\2\2WX\7#\2\2X\26"+
		"\3\2\2\2YZ\7@\2\2Z\30\3\2\2\2[\\\7>\2\2\\\32\3\2\2\2]^\7@\2\2^_\7?\2\2"+
		"_\34\3\2\2\2`a\7>\2\2ab\7?\2\2b\36\3\2\2\2cd\7?\2\2de\7?\2\2e \3\2\2\2"+
		"fg\7#\2\2gh\7?\2\2h\"\3\2\2\2ij\7?\2\2j$\3\2\2\2kl\7}\2\2l&\3\2\2\2mn"+
		"\7\177\2\2n(\3\2\2\2op\7*\2\2p*\3\2\2\2qr\7+\2\2r,\3\2\2\2st\7=\2\2t."+
		"\3\2\2\2uy\t\2\2\2vx\t\3\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z"+
		"\60\3\2\2\2{y\3\2\2\2|}\t\4\2\2}\62\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\b\32\2\2\u0084\64\3\2\2\2\5\2y\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}