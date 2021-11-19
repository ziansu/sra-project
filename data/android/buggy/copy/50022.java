@java.lang.Override
protected void handleLongClick() {
    if (!(mAdvancedMode)) {
        mHost.startSettingsActivity(com.android.systemui.qs.tiles.RotationLockTile.DISPLAY_SETTINGS);
    }else {
        mHost.startSettingsActivity(com.android.systemui.qs.tiles.RotationLockTile.DISPLAY_ROTATION_SETTINGS);
    }
}