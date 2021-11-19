@java.lang.Override
public void enterNow(@org.antlr.v4.runtime.misc.NotNull
final se.tre.freki.query.SelectParser.NowContext ctx) {
    super.enterNow(ctx);
    buildTime(isStartTime, now);
}