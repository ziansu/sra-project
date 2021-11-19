@java.lang.Override
public lp2jvm.parser.AstNode visitRightApplicationTerm(lp2jvm.parser.LpToJvmParser.RightApplicationTermContext ctx) {
    return new lp2jvm.parser.ApplicationNode(visit(ctx.lambdaTerm(1)), visit(ctx.lambdaTerm(0)));
}