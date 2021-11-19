public void testClearFileContents() {
    TextBuddy.clearFileContents();
    assertEquals(((fileName) + " is empty\n"), TextBuddy.displayFileContents());
}