@java.lang.Override
public void draw(android.graphics.Canvas canvas, com.nextgis.maplib.map.MapDrawable mapDrawable) {
    if ((mMapPoint) != null) {
        mOverlayPoint.setCoordinates(mMapPoint);
        drawOverlayItem(canvas, mOverlayPoint);
    }
}