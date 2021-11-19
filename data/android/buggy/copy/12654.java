void e(java.lang.String message) {
    if (should(com.otaliastudios.zoom.ZoomLogger.LEVEL_ERROR)) {
        android.util.Log.w(mTag, message);
        com.otaliastudios.zoom.ZoomLogger.lastMessage = message;
        com.otaliastudios.zoom.ZoomLogger.lastTag = mTag;
    }
}