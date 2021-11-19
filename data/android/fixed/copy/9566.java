private void createSubject(java.lang.String key) {
    subject = new com.sharethrough.sdk.SharethroughTest.SharethroughStub(org.robolectric.Robolectric.application, key, adCacheTimeInMilliseconds, renderer, availableCreatives, beaconService, null, adManager);
    subject.setOnStatusChangeListener(onStatusChangeListener);
}