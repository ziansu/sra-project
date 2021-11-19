@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    java.lang.System.setProperty("org.apache.poi.hwpf.preserveTextTable", java.lang.Boolean.TRUE.toString());
    _hWPFDocFixture = new org.apache.poi.hwpf.HWPFDocFixture(this, org.apache.poi.hwpf.HWPFDocFixture.DEFAULT_TEST_FILE);
    _hWPFDocFixture.setUp();
}