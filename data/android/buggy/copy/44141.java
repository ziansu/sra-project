@org.junit.Before
public void setUp() {
    filter = new com.puppycrawl.tools.checkstyle.filters.SuppressElement("Test");
    filter.setChecks("Test");
}