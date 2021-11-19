@org.junit.Before
public void setUp() throws java.lang.Exception {
    this.context = org.robolectric.RuntimeEnvironment.application;
    client = new org.unfoldingword.door43client.Door43Client(context, resourceDir.getRoot(), resourceDir.getRoot());
}