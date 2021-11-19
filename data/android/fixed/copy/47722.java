@java.lang.Override
public Concrete.UniverseExpression visitProp(com.jetbrains.jetpad.vclang.parser.PropContext ctx) {
    return new com.jetbrains.jetpad.vclang.term.Concrete.UniverseExpression(tokenPosition(ctx.PROP().getSymbol()), new com.jetbrains.jetpad.vclang.term.Abstract.UniverseExpression.Universe(0, Abstract.UniverseExpression.Universe.PROP));
}