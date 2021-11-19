@java.lang.Override
public java.lang.Object execute(jp.vmi.selenium.selenese.Context context, java.lang.String... args) {
    return ((org.openqa.selenium.JavascriptExecutor) (context.getWrappedDriver())).executeScript(args[jp.vmi.selenium.selenese.subcommand.GetExpression.ARG_EXPR]);
}