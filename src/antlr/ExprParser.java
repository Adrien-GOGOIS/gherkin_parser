// Generated from Expr.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, Scenario=2, ScenarioOutline=3, Feature=4, Space=5, NewLine=6, 
		Word=7;
	public static final int
		RULE_prog = 0, RULE_feature = 1, RULE_featHeader = 2, RULE_featBody = 3, 
		RULE_blockBody = 4, RULE_scenario = 5, RULE_outlineScenario = 6, RULE_restOfLine = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "feature", "featHeader", "featBody", "blockBody", "scenario", 
			"outlineScenario", "restOfLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Scenario:'", "'Scenario Outline:'", "'Feature:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "Scenario", "ScenarioOutline", "Feature", "Space", "NewLine", 
			"Word"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				feature();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Feature || _la==Space );
			setState(21);
			match(EOF);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FeatureDeclarationContext extends FeatureContext {
		public FeatHeaderContext featHeader() {
			return getRuleContext(FeatHeaderContext.class,0);
		}
		public FeatBodyContext featBody() {
			return getRuleContext(FeatBodyContext.class,0);
		}
		public FeatureDeclarationContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFeatureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFeatureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFeatureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_feature);
		try {
			_localctx = new FeatureDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			featHeader();
			setState(24);
			featBody();
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

	public static class FeatHeaderContext extends ParserRuleContext {
		public FeatHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featHeader; }
	 
		public FeatHeaderContext() { }
		public void copyFrom(FeatHeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FeatureHeaderContext extends FeatHeaderContext {
		public TerminalNode Feature() { return getToken(ExprParser.Feature, 0); }
		public RestOfLineContext restOfLine() {
			return getRuleContext(RestOfLineContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(ExprParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ExprParser.Space, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(ExprParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(ExprParser.NewLine, i);
		}
		public FeatureHeaderContext(FeatHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFeatureHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFeatureHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFeatureHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatHeaderContext featHeader() throws RecognitionException {
		FeatHeaderContext _localctx = new FeatHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_featHeader);
		int _la;
		try {
			int _alt;
			_localctx = new FeatureHeaderContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(26);
				match(Space);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(Feature);
			setState(33);
			restOfLine();
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FeatBodyContext extends ParserRuleContext {
		public FeatBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featBody; }
	 
		public FeatBodyContext() { }
		public void copyFrom(FeatBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FeatureBodyContext extends FeatBodyContext {
		public List<ScenarioContext> scenario() {
			return getRuleContexts(ScenarioContext.class);
		}
		public ScenarioContext scenario(int i) {
			return getRuleContext(ScenarioContext.class,i);
		}
		public List<OutlineScenarioContext> outlineScenario() {
			return getRuleContexts(OutlineScenarioContext.class);
		}
		public OutlineScenarioContext outlineScenario(int i) {
			return getRuleContext(OutlineScenarioContext.class,i);
		}
		public FeatureBodyContext(FeatBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFeatureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFeatureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFeatureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatBodyContext featBody() throws RecognitionException {
		FeatBodyContext _localctx = new FeatBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featBody);
		try {
			int _alt;
			_localctx = new FeatureBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(41);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(39);
						scenario();
						}
						break;
					case 2:
						{
						setState(40);
						outlineScenario();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockBodyContext extends ParserRuleContext {
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
	 
		public BlockBodyContext() { }
		public void copyFrom(BlockBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockBodyDeclarationContext extends BlockBodyContext {
		public List<RestOfLineContext> restOfLine() {
			return getRuleContexts(RestOfLineContext.class);
		}
		public RestOfLineContext restOfLine(int i) {
			return getRuleContext(RestOfLineContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(ExprParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(ExprParser.NewLine, i);
		}
		public BlockBodyDeclarationContext(BlockBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlockBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlockBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlockBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockBody);
		try {
			int _alt;
			_localctx = new BlockBodyDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			restOfLine();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(NewLine);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					restOfLine();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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

	public static class ScenarioContext extends ParserRuleContext {
		public ScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario; }
	 
		public ScenarioContext() { }
		public void copyFrom(ScenarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScenarioDeclarationContext extends ScenarioContext {
		public TerminalNode Scenario() { return getToken(ExprParser.Scenario, 0); }
		public RestOfLineContext restOfLine() {
			return getRuleContext(RestOfLineContext.class,0);
		}
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(ExprParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(ExprParser.NewLine, i);
		}
		public List<TerminalNode> Space() { return getTokens(ExprParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ExprParser.Space, i);
		}
		public ScenarioDeclarationContext(ScenarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterScenarioDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitScenarioDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitScenarioDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScenarioContext scenario() throws RecognitionException {
		ScenarioContext _localctx = new ScenarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scenario);
		int _la;
		try {
			int _alt;
			_localctx = new ScenarioDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==Space || _la==NewLine) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(Scenario);
			setState(65);
			restOfLine();
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(71);
			blockBody();
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

	public static class OutlineScenarioContext extends ParserRuleContext {
		public OutlineScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlineScenario; }
	 
		public OutlineScenarioContext() { }
		public void copyFrom(OutlineScenarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutlineScenarioDeclarationContext extends OutlineScenarioContext {
		public TerminalNode ScenarioOutline() { return getToken(ExprParser.ScenarioOutline, 0); }
		public RestOfLineContext restOfLine() {
			return getRuleContext(RestOfLineContext.class,0);
		}
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(ExprParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(ExprParser.NewLine, i);
		}
		public List<TerminalNode> Space() { return getTokens(ExprParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ExprParser.Space, i);
		}
		public OutlineScenarioDeclarationContext(OutlineScenarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOutlineScenarioDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOutlineScenarioDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOutlineScenarioDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutlineScenarioContext outlineScenario() throws RecognitionException {
		OutlineScenarioContext _localctx = new OutlineScenarioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outlineScenario);
		int _la;
		try {
			int _alt;
			_localctx = new OutlineScenarioDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==Space || _la==NewLine) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(ScenarioOutline);
			setState(80);
			restOfLine();
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(86);
			blockBody();
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

	public static class RestOfLineContext extends ParserRuleContext {
		public RestOfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restOfLine; }
	 
		public RestOfLineContext() { }
		public void copyFrom(RestOfLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RestOfLineDeclarationContext extends RestOfLineContext {
		public List<TerminalNode> Word() { return getTokens(ExprParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(ExprParser.Word, i);
		}
		public List<TerminalNode> Space() { return getTokens(ExprParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ExprParser.Space, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(ExprParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(ExprParser.NewLine, i);
		}
		public RestOfLineDeclarationContext(RestOfLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRestOfLineDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRestOfLineDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRestOfLineDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestOfLineContext restOfLine() throws RecognitionException {
		RestOfLineContext _localctx = new RestOfLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_restOfLine);
		int _la;
		try {
			int _alt;
			_localctx = new RestOfLineDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==Space || _la==NewLine) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(Word);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					_la = _input.LA(1);
					if ( !(_la==Space || _la==Word) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
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
		"\u0004\u0001\u0007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"\u001c\b\u0002\n\u0002\f\u0002\u001f\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002$\b\u0002\u000b\u0002\f\u0002%\u0001\u0003\u0001\u0003"+
		"\u0004\u0003*\b\u0003\u000b\u0003\f\u0003+\u0001\u0004\u0001\u0004\u0005"+
		"\u00040\b\u0004\n\u0004\f\u00043\t\u0004\u0001\u0004\u0005\u00046\b\u0004"+
		"\n\u0004\f\u00049\t\u0004\u0001\u0005\u0005\u0005<\b\u0005\n\u0005\f\u0005"+
		"?\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005D\b\u0005\u000b"+
		"\u0005\f\u0005E\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006K\b\u0006"+
		"\n\u0006\f\u0006N\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"S\b\u0006\u000b\u0006\f\u0006T\u0001\u0006\u0001\u0006\u0001\u0007\u0005"+
		"\u0007Z\b\u0007\n\u0007\f\u0007]\t\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007a\b\u0007\n\u0007\f\u0007d\t\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000\u0005\u0006\u0002"+
		"\u0000\u0005\u0005\u0007\u0007j\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u0017\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006"+
		")\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fL\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019"+
		"\u0003\u0001\u0000\u0000\u0000\u001a\u001c\u0005\u0005\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		" \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005"+
		"\u0004\u0000\u0000!#\u0003\u000e\u0007\u0000\"$\u0005\u0006\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'*\u0003"+
		"\n\u0005\u0000(*\u0003\f\u0006\u0000)\'\u0001\u0000\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-1\u0003\u000e"+
		"\u0007\u0000.0\u0005\u0006\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"27\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0003\u000e\u0007"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0007\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0002"+
		"\u0000\u0000AC\u0003\u000e\u0007\u0000BD\u0005\u0006\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0003\b\u0004\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0003\u0000\u0000PR\u0003\u000e\u0007\u0000QS\u0005\u0006\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003"+
		"\b\u0004\u0000W\r\u0001\u0000\u0000\u0000XZ\u0007\u0000\u0000\u0000YX"+
		"\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^b\u0005\u0007\u0000\u0000_a\u0007\u0001\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u000f\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000\r\u0013\u001d%)+17=ELT[b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}