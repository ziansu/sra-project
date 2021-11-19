@java.lang.Override
public de.bmoth.parser.ast.Node visitCastPredicateExpression(de.bmoth.antlr.BMoThParser.CastPredicateExpressionContext ctx) {
    java.lang.String operator = ctx.BOOL_CAST().getText();
    de.bmoth.parser.ast.PredicateNode predicate = ((de.bmoth.parser.ast.PredicateNode) (ctx.predicate().accept(this)));
    return new de.bmoth.parser.ast.CastPredicateExpressionNode(predicate);
}