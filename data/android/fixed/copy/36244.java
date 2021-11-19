@org.junit.Test
public void tag_changeName() throws java.lang.Exception {
    edu.groupawesome.quotetracker.Tag tag = new edu.groupawesome.quotetracker.Tag("Test");
    assertEquals(tag.getTagName(), "Test");
    tag.changeTagName("New name");
    assertEquals(tag.getTagName(), "New name");
}