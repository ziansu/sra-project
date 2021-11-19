private void assertLoadedNoUrl() {
    assertTrue("Requested a search or preload when none was expected!", ((mFakeServer.getLoadedUrl()) == null));
}