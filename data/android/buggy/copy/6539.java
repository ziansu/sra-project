@java.lang.Override
public void draw(android.graphics.Canvas canvas, com.nextgis.maplib.map.MapDrawable mapDrawable) {
    if ((mMapPoint) != null) {
        mOverlayPoint.setCoordinates(mMapPoint.getX(), mMapPoint.getY());
        drawOverlayItem(canvas, mOverlayPoint);
    }
}