public static java.lang.String getExpectedResult(final io.toast.tk.dao.domain.impl.test.block.line.TestLine line) {
    java.lang.String message = line.getExpected();
    message = (message != null) ? io.toast.tk.runtime.report.TemplateHelper.returnResult(message) : "";
    return io.toast.tk.runtime.report.TemplateHelper.prettyXmlText(message);
}