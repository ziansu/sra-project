private void setFullscreenFlags(boolean fullscreen) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        int fullscreenFlags = (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN);
        setSystemUiFlags(fullscreenFlags, fullscreen);
    }
}