@java.lang.Override
public Concrete.Expression visitAtomLiteral(com.jetbrains.jetpad.vclang.parser.AtomLiteralContext ctx) {
    return visitExpr(ctx.literal());
}