@java.lang.Override
public void enterScope(java.lang.String name) {
    java.lang.System.out.println(("enterScope " + name));
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.elementAt(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_ENTER);
}