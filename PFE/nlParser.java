// Generated from nl.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		DIGIT=60, MMM=61, WORD=62, EROOR_RECOGNITION=63, WS=64;
	public static final int
		RULE_why_question = 0, RULE_question_pronoun = 1, RULE_fil_ter = 2, RULE_temporel_dimension = 3, 
		RULE_filter_operator = 4, RULE_dimension_marker = 5, RULE_ng = 6, RULE_ngf = 7, 
		RULE_ng1 = 8, RULE_ng_f1 = 9, RULE_determinant = 10, RULE_conj_coordination = 11, 
		RULE_trend_indicator = 12, RULE_nominal_term = 13, RULE_noun = 14, RULE_mesure_indicator = 15, 
		RULE_temporel_lexicon = 16, RULE_adjective = 17, RULE_past_participale = 18, 
		RULE_preposition = 19, RULE_mg = 20, RULE_verb = 21, RULE_date = 22, RULE_interogation = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"why_question", "question_pronoun", "fil_ter", "temporel_dimension", 
			"filter_operator", "dimension_marker", "ng", "ngf", "ng1", "ng_f1", "determinant", 
			"conj_coordination", "trend_indicator", "nominal_term", "noun", "mesure_indicator", 
			"temporel_lexicon", "adjective", "past_participale", "preposition", "mg", 
			"verb", "date", "interogation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'why'", "'equal'", "'more than'", "'this'", "'less than'", "'with'", 
			"'between'", "'for'", "'during'", "'since'", "'while'", "'when'", "'according to'", 
			"','", "'DT'", "'and'", "'decrease'", "'increase'", "'low'", "'high'", 
			"'stagnation'", "'stable'", "'evolve'", "'didn't evolve'", "'decreased'", 
			"'increased'", "'NN'", "'NNS'", "'NNP'", "'NNPS'", "'quantity'", "'amount'", 
			"'total'", "'number'", "'volume'", "'ratio'", "'percentage'", "'degree'", 
			"'time'", "'year'", "'month'", "'day'", "'season'", "'hour'", "'minute'", 
			"'seconde'", "'JJ'", "'JJR'", "'JJS'", "'VBN'", "'IN'", "'in'", "'VB'", 
			"'VBG'", "'VBD'", "'VBP'", "'VBZ'", "'/'", "'?'", "'CD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DIGIT", "MMM", "WORD", "EROOR_RECOGNITION", "WS"
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
	public String getGrammarFileName() { return "nl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Why_questionContext extends ParserRuleContext {
		public Why_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_why_question; }
	 
		public Why_questionContext() { }
		public void copyFrom(Why_questionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorContext extends Why_questionContext {
		public TerminalNode EROOR_RECOGNITION() { return getToken(nlParser.EROOR_RECOGNITION, 0); }
		public ErrorContext(Why_questionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitError(this);
		}
	}
	public static class WhyExprContext extends Why_questionContext {
		public Question_pronounContext question_pronoun() {
			return getRuleContext(Question_pronounContext.class,0);
		}
		public NgContext ng() {
			return getRuleContext(NgContext.class,0);
		}
		public Trend_indicatorContext trend_indicator() {
			return getRuleContext(Trend_indicatorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(nlParser.EOF, 0); }
		public List<MgContext> mg() {
			return getRuleContexts(MgContext.class);
		}
		public MgContext mg(int i) {
			return getRuleContext(MgContext.class,i);
		}
		public List<Fil_terContext> fil_ter() {
			return getRuleContexts(Fil_terContext.class);
		}
		public Fil_terContext fil_ter(int i) {
			return getRuleContext(Fil_terContext.class,i);
		}
		public InterogationContext interogation() {
			return getRuleContext(InterogationContext.class,0);
		}
		public WhyExprContext(Why_questionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterWhyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitWhyExpr(this);
		}
	}

	public final Why_questionContext why_question() throws RecognitionException {
		Why_questionContext _localctx = new Why_questionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_why_question);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new WhyExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				question_pronoun();
				setState(49);
				ng();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << WORD))) != 0)) {
					{
					{
					setState(50);
					mg();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				trend_indicator();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << WORD))) != 0)) {
					{
					{
					setState(57);
					mg();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					fil_ter();
					}
					}
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__50) | (1L << T__51))) != 0) );
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(68);
					interogation();
					}
				}

				setState(71);
				match(EOF);
				}
				break;
			case EROOR_RECOGNITION:
				_localctx = new ErrorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(EROOR_RECOGNITION);
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

	public static class Question_pronounContext extends ParserRuleContext {
		public Question_pronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterQuestion_pronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitQuestion_pronoun(this);
		}
	}

	public final Question_pronounContext question_pronoun() throws RecognitionException {
		Question_pronounContext _localctx = new Question_pronounContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question_pronoun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
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

	public static class Fil_terContext extends ParserRuleContext {
		public Dimension_markerContext dimension_marker() {
			return getRuleContext(Dimension_markerContext.class,0);
		}
		public NgfContext ngf() {
			return getRuleContext(NgfContext.class,0);
		}
		public Temporel_dimensionContext temporel_dimension() {
			return getRuleContext(Temporel_dimensionContext.class,0);
		}
		public Filter_operatorContext filter_operator() {
			return getRuleContext(Filter_operatorContext.class,0);
		}
		public Fil_terContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fil_ter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterFil_ter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitFil_ter(this);
		}
	}

	public final Fil_terContext fil_ter() throws RecognitionException {
		Fil_terContext _localctx = new Fil_terContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fil_ter);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				dimension_marker();
				setState(79);
				ngf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				dimension_marker();
				setState(82);
				temporel_dimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				filter_operator();
				setState(85);
				ngf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				filter_operator();
				setState(88);
				temporel_dimension();
				}
				break;
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

	public static class Temporel_dimensionContext extends ParserRuleContext {
		public NgContext ng() {
			return getRuleContext(NgContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Temporel_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporel_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterTemporel_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitTemporel_dimension(this);
		}
	}

	public final Temporel_dimensionContext temporel_dimension() throws RecognitionException {
		Temporel_dimensionContext _localctx = new Temporel_dimensionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_temporel_dimension);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				ng();
				setState(93);
				date();
				}
				break;
			case DIGIT:
			case MMM:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				date();
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

	public static class Filter_operatorContext extends ParserRuleContext {
		public Filter_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterFilter_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitFilter_operator(this);
		}
	}

	public final Filter_operatorContext filter_operator() throws RecognitionException {
		Filter_operatorContext _localctx = new Filter_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filter_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Dimension_markerContext extends ParserRuleContext {
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public Dimension_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterDimension_marker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitDimension_marker(this);
		}
	}

	public final Dimension_markerContext dimension_marker() throws RecognitionException {
		Dimension_markerContext _localctx = new Dimension_markerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dimension_marker);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__8);
				}
				break;
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				preposition();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(T__12);
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

	public static class NgContext extends ParserRuleContext {
		public List<Ng1Context> ng1() {
			return getRuleContexts(Ng1Context.class);
		}
		public Ng1Context ng1(int i) {
			return getRuleContext(Ng1Context.class,i);
		}
		public List<DeterminantContext> determinant() {
			return getRuleContexts(DeterminantContext.class);
		}
		public DeterminantContext determinant(int i) {
			return getRuleContext(DeterminantContext.class,i);
		}
		public Conj_coordinationContext conj_coordination() {
			return getRuleContext(Conj_coordinationContext.class,0);
		}
		public NgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNg(this);
		}
	}

	public final NgContext ng() throws RecognitionException {
		NgContext _localctx = new NgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ng);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(109);
				determinant();
				}
			}

			setState(112);
			ng1();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(T__13);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(114);
						determinant();
						}
					}

					setState(117);
					ng1();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				}
				break;
			case 2:
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(122);
					match(T__13);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(123);
						determinant();
						}
					}

					setState(126);
					ng1();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(132);
				conj_coordination();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(133);
					determinant();
					}
				}

				setState(136);
				ng1();
				}
				}
				break;
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

	public static class NgfContext extends ParserRuleContext {
		public List<Ng_f1Context> ng_f1() {
			return getRuleContexts(Ng_f1Context.class);
		}
		public Ng_f1Context ng_f1(int i) {
			return getRuleContext(Ng_f1Context.class,i);
		}
		public List<DeterminantContext> determinant() {
			return getRuleContexts(DeterminantContext.class);
		}
		public DeterminantContext determinant(int i) {
			return getRuleContext(DeterminantContext.class,i);
		}
		public Conj_coordinationContext conj_coordination() {
			return getRuleContext(Conj_coordinationContext.class,0);
		}
		public NgfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNgf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNgf(this);
		}
	}

	public final NgfContext ngf() throws RecognitionException {
		NgfContext _localctx = new NgfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ngf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(140);
				determinant();
				}
			}

			setState(143);
			ng_f1();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(T__13);
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(145);
						determinant();
						}
					}

					setState(148);
					ng_f1();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				}
				break;
			case 2:
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(153);
					match(T__13);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(154);
						determinant();
						}
					}

					setState(157);
					ng_f1();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(163);
				conj_coordination();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(164);
					determinant();
					}
				}

				setState(167);
				ng_f1();
				}
				}
				break;
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

	public static class Ng1Context extends ParserRuleContext {
		public List<Nominal_termContext> nominal_term() {
			return getRuleContexts(Nominal_termContext.class);
		}
		public Nominal_termContext nominal_term(int i) {
			return getRuleContext(Nominal_termContext.class,i);
		}
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public List<PrepositionContext> preposition() {
			return getRuleContexts(PrepositionContext.class);
		}
		public PrepositionContext preposition(int i) {
			return getRuleContext(PrepositionContext.class,i);
		}
		public List<Past_participaleContext> past_participale() {
			return getRuleContexts(Past_participaleContext.class);
		}
		public Past_participaleContext past_participale(int i) {
			return getRuleContext(Past_participaleContext.class,i);
		}
		public Ng1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNg1(this);
		}
	}

	public final Ng1Context ng1() throws RecognitionException {
		Ng1Context _localctx = new Ng1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_ng1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				{
				setState(171);
				nominal_term();
				}
				break;
			case T__46:
			case T__47:
			case T__48:
				{
				setState(172);
				adjective();
				}
				break;
			case T__50:
			case T__51:
				{
				setState(173);
				preposition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
					{
					setState(176);
					nominal_term();
					}
					break;
				case T__46:
				case T__47:
				case T__48:
					{
					setState(177);
					adjective();
					}
					break;
				case T__49:
					{
					setState(178);
					past_participale();
					}
					break;
				case T__50:
				case T__51:
					{
					setState(179);
					preposition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
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

	public static class Ng_f1Context extends ParserRuleContext {
		public List<Nominal_termContext> nominal_term() {
			return getRuleContexts(Nominal_termContext.class);
		}
		public Nominal_termContext nominal_term(int i) {
			return getRuleContext(Nominal_termContext.class,i);
		}
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public List<Past_participaleContext> past_participale() {
			return getRuleContexts(Past_participaleContext.class);
		}
		public Past_participaleContext past_participale(int i) {
			return getRuleContext(Past_participaleContext.class,i);
		}
		public Ng_f1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_f1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNg_f1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNg_f1(this);
		}
	}

	public final Ng_f1Context ng_f1() throws RecognitionException {
		Ng_f1Context _localctx = new Ng_f1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_ng_f1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				{
				setState(185);
				nominal_term();
				}
				break;
			case T__46:
			case T__47:
			case T__48:
				{
				setState(186);
				adjective();
				}
				break;
			case T__50:
			case T__51:
				{
				setState(187);
				preposition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
					{
					setState(190);
					nominal_term();
					}
					break;
				case T__46:
				case T__47:
				case T__48:
					{
					setState(191);
					adjective();
					}
					break;
				case T__49:
					{
					setState(192);
					past_participale();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
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

	public static class DeterminantContext extends ParserRuleContext {
		public DeterminantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determinant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterDeterminant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitDeterminant(this);
		}
	}

	public final DeterminantContext determinant() throws RecognitionException {
		DeterminantContext _localctx = new DeterminantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_determinant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__14);
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

	public static class Conj_coordinationContext extends ParserRuleContext {
		public Conj_coordinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj_coordination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterConj_coordination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitConj_coordination(this);
		}
	}

	public final Conj_coordinationContext conj_coordination() throws RecognitionException {
		Conj_coordinationContext _localctx = new Conj_coordinationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conj_coordination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__15);
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

	public static class Trend_indicatorContext extends ParserRuleContext {
		public Trend_indicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trend_indicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterTrend_indicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitTrend_indicator(this);
		}
	}

	public final Trend_indicatorContext trend_indicator() throws RecognitionException {
		Trend_indicatorContext _localctx = new Trend_indicatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_trend_indicator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Nominal_termContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Mesure_indicatorContext mesure_indicator() {
			return getRuleContext(Mesure_indicatorContext.class,0);
		}
		public Temporel_lexiconContext temporel_lexicon() {
			return getRuleContext(Temporel_lexiconContext.class,0);
		}
		public Nominal_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominal_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNominal_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNominal_term(this);
		}
	}

	public final Nominal_termContext nominal_term() throws RecognitionException {
		Nominal_termContext _localctx = new Nominal_termContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nominal_term);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				noun();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				mesure_indicator();
				}
				break;
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				temporel_lexicon();
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

	public static class NounContext extends ParserRuleContext {
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Mesure_indicatorContext extends ParserRuleContext {
		public Mesure_indicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mesure_indicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterMesure_indicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitMesure_indicator(this);
		}
	}

	public final Mesure_indicatorContext mesure_indicator() throws RecognitionException {
		Mesure_indicatorContext _localctx = new Mesure_indicatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mesure_indicator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Temporel_lexiconContext extends ParserRuleContext {
		public Temporel_lexiconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporel_lexicon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterTemporel_lexicon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitTemporel_lexicon(this);
		}
	}

	public final Temporel_lexiconContext temporel_lexicon() throws RecognitionException {
		Temporel_lexiconContext _localctx = new Temporel_lexiconContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_temporel_lexicon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AdjectiveContext extends ParserRuleContext {
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitAdjective(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_adjective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Past_participaleContext extends ParserRuleContext {
		public Past_participaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_past_participale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterPast_participale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitPast_participale(this);
		}
	}

	public final Past_participaleContext past_participale() throws RecognitionException {
		Past_participaleContext _localctx = new Past_participaleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_past_participale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__49);
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

	public static class PrepositionContext extends ParserRuleContext {
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitPreposition(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MgContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TerminalNode WORD() { return getToken(nlParser.WORD, 0); }
		public MgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterMg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitMg(this);
		}
	}

	public final MgContext mg() throws RecognitionException {
		MgContext _localctx = new MgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mg);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				verb();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(WORD);
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

	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(nlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(nlParser.DIGIT, i);
		}
		public TerminalNode MMM() { return getToken(nlParser.MMM, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_date);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(DIGIT);
				setState(228);
				match(T__57);
				setState(229);
				match(MMM);
				setState(230);
				match(T__57);
				setState(231);
				match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(DIGIT);
				setState(233);
				match(T__57);
				setState(234);
				match(DIGIT);
				setState(235);
				match(T__57);
				setState(236);
				match(DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(MMM);
				setState(238);
				match(T__57);
				setState(239);
				match(DIGIT);
				setState(240);
				match(T__57);
				setState(241);
				match(DIGIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(MMM);
				setState(243);
				match(T__57);
				setState(244);
				match(DIGIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(MMM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(DIGIT);
				}
				break;
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

	public static class InterogationContext extends ParserRuleContext {
		public InterogationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interogation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).enterInterogation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nlListener ) ((nlListener)listener).exitInterogation(this);
		}
	}

	public final InterogationContext interogation() throws RecognitionException {
		InterogationContext _localctx = new InterogationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interogation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__58);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\6\2C\n\2\r\2\16\2D\3\2\5\2H\n\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\3\5"+
		"\5\5c\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\5\bq\n\b\3"+
		"\b\3\b\3\b\5\bv\n\b\3\b\6\by\n\b\r\b\16\bz\3\b\3\b\5\b\177\n\b\3\b\7\b"+
		"\u0082\n\b\f\b\16\b\u0085\13\b\3\b\3\b\5\b\u0089\n\b\3\b\3\b\5\b\u008d"+
		"\n\b\3\t\5\t\u0090\n\t\3\t\3\t\3\t\5\t\u0095\n\t\3\t\6\t\u0098\n\t\r\t"+
		"\16\t\u0099\3\t\3\t\5\t\u009e\n\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13"+
		"\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\5\n\u00b1\n"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00b7\n\n\f\n\16\n\u00ba\13\n\3\13\3\13\3\13\5"+
		"\13\u00bf\n\13\3\13\3\13\3\13\7\13\u00c4\n\13\f\13\16\13\u00c7\13\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00e2\n\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fa\n\30\3\31\3\31\3\31"+
		"\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\3\2\4\t"+
		"\3\2\23\34\3\2\35 \3\2!(\3\2)\60\3\2\61\63\3\2\65\66\3\2\67;\2\u0117\2"+
		"L\3\2\2\2\4N\3\2\2\2\6\\\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fm\3\2\2\2\16p"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u00b0\3\2\2\2\24\u00be\3\2\2\2\26\u00c8\3"+
		"\2\2\2\30\u00ca\3\2\2\2\32\u00cc\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2"+
		"\2\2 \u00d5\3\2\2\2\"\u00d7\3\2\2\2$\u00d9\3\2\2\2&\u00db\3\2\2\2(\u00dd"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\63\5\4\3\2\63\67\5\16\b\2\64\66\5*\26\2\65\64\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:>\5\32\16\2;=\5*\26\2"+
		"<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2AC\5\6\4\2"+
		"BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\60\31\2GF\3\2\2"+
		"\2GH\3\2\2\2HI\3\2\2\2IJ\7\2\2\3JM\3\2\2\2KM\7A\2\2L\62\3\2\2\2LK\3\2"+
		"\2\2M\3\3\2\2\2NO\7\3\2\2O\5\3\2\2\2PQ\5\f\7\2QR\5\20\t\2R]\3\2\2\2ST"+
		"\5\f\7\2TU\5\b\5\2U]\3\2\2\2VW\5\n\6\2WX\5\20\t\2X]\3\2\2\2YZ\5\n\6\2"+
		"Z[\5\b\5\2[]\3\2\2\2\\P\3\2\2\2\\S\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]\7\3"+
		"\2\2\2^_\5\16\b\2_`\5.\30\2`c\3\2\2\2ac\5.\30\2b^\3\2\2\2ba\3\2\2\2c\t"+
		"\3\2\2\2de\t\2\2\2e\13\3\2\2\2fn\7\n\2\2gn\7\13\2\2hn\5(\25\2in\7\f\2"+
		"\2jn\7\r\2\2kn\7\16\2\2ln\7\17\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2"+
		"\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2oq\5\26\f\2po\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2r\u008c\5\22\n\2su\7\20\2\2tv\5\26\f\2ut\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wy\5\22\n\2xs\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u008d"+
		"\3\2\2\2|~\7\20\2\2}\177\5\26\f\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0082\5\22\n\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\5\30\r\2\u0087\u0089\5\26\f\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\22\n\2\u008b\u008d\3\2\2\2\u008c"+
		"x\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e"+
		"\u0090\5\26\f\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u00ab\5\24\13\2\u0092\u0094\7\20\2\2\u0093\u0095\5\26\f\2"+
		"\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098"+
		"\5\24\13\2\u0097\u0092\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u00ac\3\2\2\2\u009b\u009d\7\20\2\2\u009c\u009e"+
		"\5\26\f\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a1\5\24\13\2\u00a0\u009b\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a7\5\30\r\2\u00a6\u00a8\5\26\f\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0097\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\21\3\2\2"+
		"\2\u00ad\u00b1\5\34\17\2\u00ae\u00b1\5$\23\2\u00af\u00b1\5(\25\2\u00b0"+
		"\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b8\3\2"+
		"\2\2\u00b2\u00b7\5\34\17\2\u00b3\u00b7\5$\23\2\u00b4\u00b7\5&\24\2\u00b5"+
		"\u00b7\5(\25\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\23\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\5\34\17"+
		"\2\u00bc\u00bf\5$\23\2\u00bd\u00bf\5(\25\2\u00be\u00bb\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c5\3\2\2\2\u00c0\u00c4\5\34\17\2"+
		"\u00c1\u00c4\5$\23\2\u00c2\u00c4\5&\24\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\21\2"+
		"\2\u00c9\27\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\31\3\2\2\2\u00cc\u00cd"+
		"\t\3\2\2\u00cd\33\3\2\2\2\u00ce\u00d2\5\36\20\2\u00cf\u00d2\5 \21\2\u00d0"+
		"\u00d2\5\"\22\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\37\3\2\2\2\u00d5\u00d6"+
		"\t\5\2\2\u00d6!\3\2\2\2\u00d7\u00d8\t\6\2\2\u00d8#\3\2\2\2\u00d9\u00da"+
		"\t\7\2\2\u00da%\3\2\2\2\u00db\u00dc\7\64\2\2\u00dc\'\3\2\2\2\u00dd\u00de"+
		"\t\b\2\2\u00de)\3\2\2\2\u00df\u00e2\5,\27\2\u00e0\u00e2\7@\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e4\t\t\2\2\u00e4"+
		"-\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7<\2\2\u00e7\u00e8\7?\2\2\u00e8"+
		"\u00e9\7<\2\2\u00e9\u00fa\7>\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7<\2\2"+
		"\u00ec\u00ed\7>\2\2\u00ed\u00ee\7<\2\2\u00ee\u00fa\7>\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0\u00f1\7<\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7<\2\2\u00f3"+
		"\u00fa\7>\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7<\2\2\u00f6\u00fa\7>\2\2"+
		"\u00f7\u00fa\7?\2\2\u00f8\u00fa\7>\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00ea"+
		"\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc\61\3\2\2\2!\67"+
		">DGL\\bmpuz~\u0083\u0088\u008c\u008f\u0094\u0099\u009d\u00a2\u00a7\u00ab"+
		"\u00b0\u00b6\u00b8\u00be\u00c3\u00c5\u00d1\u00e1\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}