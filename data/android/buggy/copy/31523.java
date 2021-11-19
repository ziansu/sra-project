public boolean encodeFrame(android.graphics.Bitmap bitmap, int delayMs) {
    if (0 != (instance)) {
        return false;
    }
    nativeEncodeFrame(instance, bitmap, delayMs);
    return true;
}