protected void setUp() throws java.lang.Exception {
    super.setUp();
    org.eclipse.swt.widgets.Display d = org.eclipse.swt.widgets.Display.getCurrent();
    while (d.readAndDispatch());
}