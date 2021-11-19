public void morphIntoFab(android.view.View fab, long hideSheetDuration, long hideSheetColorDuration, com.gordonwong.materialsheetfab.animations.AnimationListener listener) {
    revealSheetWithFab(getSheetRevealRadius(), getFabRevealRadius(fab), hideSheetDuration, sheetColor, fabColor, hideSheetColorDuration, listener);
}