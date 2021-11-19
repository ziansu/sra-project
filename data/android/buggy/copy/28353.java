public void update(com.google.android.gms.maps.Projection projection, com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    scale = mapScaleModel.setProjection(projection, cameraPosition);
    invalidate();
}