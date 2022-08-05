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
		RULE_blockBody = 4, RULE_scenario = 5, RULE_outlineScenario = 6, RULE_restOfLine = 7, 
		RULE_title = 8, RULE_word = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "feature", "featHeader", "featBody", "blockBody", "scenario", 
			"outlineScenario", "restOfLine", "title", "word"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				feature();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Feature || _la==Space );
			setState(25);
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
			setState(27);
			featHeader();
			setState(28);
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
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(30);
				match(Space);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(Feature);
			setState(37);
			title();
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(43);
						scenario();
						}
						break;
					case 2:
						{
						setState(44);
						outlineScenario();
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(50);
			restOfLine();
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(NewLine);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					restOfLine();
					}
					} 
				}
				setState(62);
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
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(63);
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
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(Scenario);
			setState(70);
			title();
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(76);
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
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(78);
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
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(ScenarioOutline);
			setState(85);
			title();
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(91);
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
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==NewLine) {
				{
				{
				setState(93);
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
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			word();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(102);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Word:
						{
						setState(100);
						word();
						}
						break;
					case Space:
						{
						setState(101);
						match(Space);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TitleContext extends ParserRuleContext {
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	 
		public TitleContext() { }
		public void copyFrom(TitleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TitleDeclarationContext extends TitleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(ExprParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ExprParser.Space, i);
		}
		public TitleDeclarationContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTitleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTitleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTitleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_title);
		int _la;
		try {
			_localctx = new TitleDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(107);
				match(Space);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			word();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==Word) {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Word:
					{
					setState(114);
					word();
					}
					break;
				case Space:
					{
					setState(115);
					match(Space);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WordContext extends ParserRuleContext {
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
	 
		public WordContext() { }
		public void copyFrom(WordContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordDeclarationContext extends WordContext {
		public TerminalNode Word() { return getToken(ExprParser.Word, 0); }
		public WordDeclarationContext(WordContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWordDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_word);
		try {
			_localctx = new WordDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(Word);
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
		"\u0004\u0001\u0007|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002(\b\u0002\u000b\u0002\f\u0002"+
		")\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u00048\t\u0004"+
		"\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0005"+
		"\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005I\b\u0005\u000b\u0005\f\u0005J\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0005\u0006P\b\u0006\n\u0006\f\u0006S\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006X\b\u0006\u000b\u0006\f\u0006"+
		"Y\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007_\b\u0007\n\u0007\f\u0007"+
		"b\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007"+
		"\f\u0007j\t\u0007\u0001\b\u0005\bm\b\b\n\b\f\bp\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\u0005"+
		"\u0006\u0082\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000"+
		"\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000"+
		"\b2\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fQ\u0001\u0000"+
		"\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000"+
		"\u0012y\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a"+
		"\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c"+
		"\u001d\u0003\u0006\u0003\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e"+
		" \u0005\u0005\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0004"+
		"\u0000\u0000%\'\u0003\u0010\b\u0000&(\u0005\u0006\u0000\u0000\'&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+.\u0003\n\u0005"+
		"\u0000,.\u0003\f\u0006\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000\u0007\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"26\u0003\u000e\u0007\u000035\u0005\u0006\u0000\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007<\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0003"+
		"\u000e\u0007\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?A\u0007\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0002\u0000\u0000FH\u0003\u0010\b\u0000GI\u0005\u0006\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0003\b\u0004"+
		"\u0000M\u000b\u0001\u0000\u0000\u0000NP\u0007\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0003\u0000\u0000UW\u0003\u0010\b\u0000VX\u0005\u0006\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0003"+
		"\b\u0004\u0000\\\r\u0001\u0000\u0000\u0000]_\u0007\u0000\u0000\u0000^"+
		"]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ch\u0003\u0012\t\u0000dg\u0003\u0012\t\u0000eg\u0005\u0005"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u000f\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0005\u0005"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qv\u0003\u0012\t\u0000ru\u0003\u0012\t\u0000"+
		"su\u0005\u0005\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0007\u0000\u0000z\u0013\u0001\u0000\u0000\u0000\u0011\u0017"+
		"!)-/6<BJQY`fhntv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}