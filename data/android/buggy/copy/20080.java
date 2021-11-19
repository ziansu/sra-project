@org.greenrobot.eventbus.Subscribe
public void onMediaUploaded(org.wordpress.android.fluxc.store.MediaStore.OnMediaUploaded event) {
    if ((event.progress) >= 1.0F) {
        assertEquals(org.wordpress.android.fluxc.release.ReleaseStack_MediaRestTest.TEST_EVENTS.UPLOADED_MEDIA, mExpectedEvent);
    }
    mCountDownLatch.countDown();
}