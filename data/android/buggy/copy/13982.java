public void testExists() throws java.lang.Exception {
    com.feedhenry.sdk.api.FHAuthSession session = com.feedhenry.sdk.api.FHAuthSession.instance;
    assertTrue(session.exists());
}