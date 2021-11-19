@java.lang.Override
public void onClick(android.view.View v) {
    if ((targetAccuracy) == (com.geoodk.collect.android.widgets.GeoPointNewWidget.UNSET_LOCATION_ACCURACY)) {
        currentMode = com.geoodk.collect.android.activities.GeoPointMapNewActivity.MODE_AUTO;
        resetLocationPointAtCurrentPosition();
        refreshClearButtonVisibility();
    }else {
        showClearDialog();
    }
}