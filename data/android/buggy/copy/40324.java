@java.lang.Override
protected com.shadark.android.react.amaps.mapview.AMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    android.util.Log.d(com.shadark.android.react.amaps.mapview.AMapManager.TAG, "AMapView");
    com.amap.api.maps.AMapOptions options = new com.amap.api.maps.AMapOptions();
    options.zoomControlsEnabled(false);
    return new com.shadark.android.react.amaps.mapview.AMapView(reactContext, mAppContext, this, options);
}