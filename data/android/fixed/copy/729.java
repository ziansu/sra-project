private void does_not_parse(java.lang.String string) {
    try {
        parser.parse(string);
        org.junit.Assert.fail("Should have failed parsing!");
    } catch (java.lang.Exception e) {
        assertContains("Duration", org.springframework.ide.vscode.commons.util.ExceptionUtil.getMessage(e));
    }
}