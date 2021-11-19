@java.lang.Override
public void onCreateGeofence(com.sergey.geo.MapPresenter.GeoFenceUIModel model) {
    activity.showProgress();
    com.sergey.geo.GeofenceModel geoModel = com.sergey.geo.GeofenceUtil.createGeofenceModelFromUIModel(uiModel);
    geoController.addGeoFence(geoModel);
}