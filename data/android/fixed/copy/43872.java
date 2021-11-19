@android.annotation.SuppressLint(value = "InlinedApi")
private void showSystemControls() {
    getActivityView().setSystemUiVisibility((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
}