public void saveMapCenterPointAndZoomLevel() {
    if ((com.wafflestudio.shafe.MapManager.mapView) == null) {
        return ;
    }
    com.wafflestudio.shafe.MapManager.mapCenterPoint = com.wafflestudio.shafe.MapManager.mapView.getMapCenterPoint();
    com.wafflestudio.shafe.MapManager.zoomLevel = com.wafflestudio.shafe.MapManager.mapView.getZoomLevel();
}