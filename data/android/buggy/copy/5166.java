public void testGetAccessibleContext() throws java.lang.Exception {
    assertNull(pane.accessibleContext);
    assertNotNull(pane.getAccessibleContext());
    assertEquals(pane.accessibleContext, pane.getAccessibleContext());
}