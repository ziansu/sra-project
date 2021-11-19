public void showTransparencyBar(net.osmand.plus.OsmandSettings.CommonPreference<java.lang.Integer> transparenPreference) {
    net.osmand.plus.views.MapControlsLayer.settingsToTransparency = transparenPreference;
    if (isTransparencyBarEnabled) {
        transparencyBarLayout.setVisibility(View.VISIBLE);
    }
    transparencyBar.setProgress(transparenPreference.get());
}