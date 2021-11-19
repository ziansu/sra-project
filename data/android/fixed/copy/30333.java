public void testCreateLinkForWebUiSameUrlAndText() {
    mockUnconnectableStoryboard();
    replayMocks();
    com.googlesource.gerrit.plugins.its.storyboard.StoryboardItsFacade itsFacade = createStoryboardItsFacade();
    java.lang.String actual = itsFacade.createLinkForWebui("Test-Url", "Test-Url");
    assertEquals("Test-Url", actual);
}