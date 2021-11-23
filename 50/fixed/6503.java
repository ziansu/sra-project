@org.testng.annotations.BeforeMethod
public void setUp() {
    root.getLoggerContext().reset();
    org.testng.AssertJUnit.assertFalse(loci.common.DebugTools.isEnabled());
}