@org.junit.Test
public void testSortFileContentsIsEmpty() {
    TextBuddy.loadFile(new java.lang.String[]{ fileName });
    TextBuddy.clearFileContents();
    assertEquals(((fileName) + " is empty\n"), TextBuddy.sortFileContents());
}