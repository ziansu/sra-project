@org.junit.Test
public void testGetParentKey_Name() {
    context.setDatabase("mydatabase");
    replayDefault();
    assertEquals("mydatabase:Space.Name", notMappedItemsCmd.getParentKey(context.getDatabase(), "Name", "Space", context));
    verifyDefault();
}