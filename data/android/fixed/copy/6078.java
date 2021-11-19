@java.lang.Override
public java.lang.String visitInfixBinOp(com.jetbrains.jetpad.vclang.parser.InfixBinOpContext ctx) {
    return ctx.BIN_OP().getText();
}