@java.lang.Override
public void onCreateGeofence(com.sergey.geo.MapPresenter.GeoFenceUIModel model) {
    com.sergey.geo.GeofenceModel geoModel = com.sergey.geo.GeofenceUtil.createGeofenceModelFromUIModel(uiModel);
    activity.showProgress();
    geoController.addGeoFence(geoModel);
}