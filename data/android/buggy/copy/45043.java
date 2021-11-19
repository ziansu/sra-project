@java.lang.Override
public void onSubmit(java.lang.String id, java.lang.Object callerContext) {
    eventDispatcher.dispatchEvent(new com.reactnative.photoview.ImageEvent(getId(), com.facebook.react.common.SystemClock.nanoTime(), ImageEvent.ON_LOAD_START));
}