// Generated from nl.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nlParser}.
 */
public interface nlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code whyExpr}
	 * labeled alternative in {@link nlParser#why_question}.
	 * @param ctx the parse tree
	 */
	void enterWhyExpr(nlParser.WhyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whyExpr}
	 * labeled alternative in {@link nlParser#why_question}.
	 * @param ctx the parse tree
	 */
	void exitWhyExpr(nlParser.WhyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Error}
	 * labeled alternative in {@link nlParser#why_question}.
	 * @param ctx the parse tree
	 */
	void enterError(nlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Error}
	 * labeled alternative in {@link nlParser#why_question}.
	 * @param ctx the parse tree
	 */
	void exitError(nlParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#question_pronoun}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_pronoun(nlParser.Question_pronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#question_pronoun}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_pronoun(nlParser.Question_pronounContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#fil_ter}.
	 * @param ctx the parse tree
	 */
	void enterFil_ter(nlParser.Fil_terContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#fil_ter}.
	 * @param ctx the parse tree
	 */
	void exitFil_ter(nlParser.Fil_terContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#temporel_dimension}.
	 * @param ctx the parse tree
	 */
	void enterTemporel_dimension(nlParser.Temporel_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#temporel_dimension}.
	 * @param ctx the parse tree
	 */
	void exitTemporel_dimension(nlParser.Temporel_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#filter_operator}.
	 * @param ctx the parse tree
	 */
	void enterFilter_operator(nlParser.Filter_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#filter_operator}.
	 * @param ctx the parse tree
	 */
	void exitFilter_operator(nlParser.Filter_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#dimension_marker}.
	 * @param ctx the parse tree
	 */
	void enterDimension_marker(nlParser.Dimension_markerContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#dimension_marker}.
	 * @param ctx the parse tree
	 */
	void exitDimension_marker(nlParser.Dimension_markerContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#ng}.
	 * @param ctx the parse tree
	 */
	void enterNg(nlParser.NgContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#ng}.
	 * @param ctx the parse tree
	 */
	void exitNg(nlParser.NgContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#ngf}.
	 * @param ctx the parse tree
	 */
	void enterNgf(nlParser.NgfContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#ngf}.
	 * @param ctx the parse tree
	 */
	void exitNgf(nlParser.NgfContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#ng1}.
	 * @param ctx the parse tree
	 */
	void enterNg1(nlParser.Ng1Context ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#ng1}.
	 * @param ctx the parse tree
	 */
	void exitNg1(nlParser.Ng1Context ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#ng_f1}.
	 * @param ctx the parse tree
	 */
	void enterNg_f1(nlParser.Ng_f1Context ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#ng_f1}.
	 * @param ctx the parse tree
	 */
	void exitNg_f1(nlParser.Ng_f1Context ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#determinant}.
	 * @param ctx the parse tree
	 */
	void enterDeterminant(nlParser.DeterminantContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#determinant}.
	 * @param ctx the parse tree
	 */
	void exitDeterminant(nlParser.DeterminantContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#conj_coordination}.
	 * @param ctx the parse tree
	 */
	void enterConj_coordination(nlParser.Conj_coordinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#conj_coordination}.
	 * @param ctx the parse tree
	 */
	void exitConj_coordination(nlParser.Conj_coordinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#trend_indicator}.
	 * @param ctx the parse tree
	 */
	void enterTrend_indicator(nlParser.Trend_indicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#trend_indicator}.
	 * @param ctx the parse tree
	 */
	void exitTrend_indicator(nlParser.Trend_indicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#nominal_term}.
	 * @param ctx the parse tree
	 */
	void enterNominal_term(nlParser.Nominal_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#nominal_term}.
	 * @param ctx the parse tree
	 */
	void exitNominal_term(nlParser.Nominal_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(nlParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(nlParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#mesure_indicator}.
	 * @param ctx the parse tree
	 */
	void enterMesure_indicator(nlParser.Mesure_indicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#mesure_indicator}.
	 * @param ctx the parse tree
	 */
	void exitMesure_indicator(nlParser.Mesure_indicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#temporel_lexicon}.
	 * @param ctx the parse tree
	 */
	void enterTemporel_lexicon(nlParser.Temporel_lexiconContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#temporel_lexicon}.
	 * @param ctx the parse tree
	 */
	void exitTemporel_lexicon(nlParser.Temporel_lexiconContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(nlParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(nlParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#past_participale}.
	 * @param ctx the parse tree
	 */
	void enterPast_participale(nlParser.Past_participaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#past_participale}.
	 * @param ctx the parse tree
	 */
	void exitPast_participale(nlParser.Past_participaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(nlParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(nlParser.PrepositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#mg}.
	 * @param ctx the parse tree
	 */
	void enterMg(nlParser.MgContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#mg}.
	 * @param ctx the parse tree
	 */
	void exitMg(nlParser.MgContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(nlParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(nlParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(nlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(nlParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link nlParser#interogation}.
	 * @param ctx the parse tree
	 */
	void enterInterogation(nlParser.InterogationContext ctx);
	/**
	 * Exit a parse tree produced by {@link nlParser#interogation}.
	 * @param ctx the parse tree
	 */
	void exitInterogation(nlParser.InterogationContext ctx);
}