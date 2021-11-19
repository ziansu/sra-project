@org.chromium.base.annotations.CalledByNative
private void onIconAvailable(android.graphics.Bitmap icon) {
    mIsInitialized = true;
    mObserver.onIconAvailable(icon);
}