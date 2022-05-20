# Generated from nl.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .nlParser import nlParser
else:
    from nlParser import nlParser

# This class defines a complete generic visitor for a parse tree produced by nlParser.

class nlVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by nlParser#whyExpr.
    def visitWhyExpr(self, ctx:nlParser.WhyExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#Error.
    def visitError(self, ctx:nlParser.ErrorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#question_pronoun.
    def visitQuestion_pronoun(self, ctx:nlParser.Question_pronounContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#fil_ter.
    def visitFil_ter(self, ctx:nlParser.Fil_terContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#temporel_dimension.
    def visitTemporel_dimension(self, ctx:nlParser.Temporel_dimensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#filter_operator.
    def visitFilter_operator(self, ctx:nlParser.Filter_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#dimension_marker.
    def visitDimension_marker(self, ctx:nlParser.Dimension_markerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#ng.
    def visitNg(self, ctx:nlParser.NgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#ngf.
    def visitNgf(self, ctx:nlParser.NgfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#ng1.
    def visitNg1(self, ctx:nlParser.Ng1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#ng_f1.
    def visitNg_f1(self, ctx:nlParser.Ng_f1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#determinant.
    def visitDeterminant(self, ctx:nlParser.DeterminantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#conj_coordination.
    def visitConj_coordination(self, ctx:nlParser.Conj_coordinationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#trend_indicator.
    def visitTrend_indicator(self, ctx:nlParser.Trend_indicatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#nominal_term.
    def visitNominal_term(self, ctx:nlParser.Nominal_termContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#noun.
    def visitNoun(self, ctx:nlParser.NounContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#mesure_indicator.
    def visitMesure_indicator(self, ctx:nlParser.Mesure_indicatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#temporel_lexicon.
    def visitTemporel_lexicon(self, ctx:nlParser.Temporel_lexiconContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#adjective.
    def visitAdjective(self, ctx:nlParser.AdjectiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#past_participale.
    def visitPast_participale(self, ctx:nlParser.Past_participaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#preposition.
    def visitPreposition(self, ctx:nlParser.PrepositionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#mg.
    def visitMg(self, ctx:nlParser.MgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#verb.
    def visitVerb(self, ctx:nlParser.VerbContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#date.
    def visitDate(self, ctx:nlParser.DateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by nlParser#interogation.
    def visitInterogation(self, ctx:nlParser.InterogationContext):
        return self.visitChildren(ctx)



del nlParser