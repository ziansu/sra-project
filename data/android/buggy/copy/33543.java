private void maybeSwapSearchIcon(@android.annotation.NonNull
android.content.ComponentName assistComponent, boolean isService) {
    if ((mView) == null) {
        onConfigurationChanged();
    }
    replaceDrawable(mView.getOrb().getLogo(), assistComponent, com.android.systemui.assist.AssistManager.ASSIST_ICON_METADATA_NAME, isService);
}