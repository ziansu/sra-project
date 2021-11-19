@java.lang.Override
public org.osmdroid.util.BoundingBox getBoundingBox() {
    if ((mCoordinates) != null)
        return org.osmdroid.util.BoundingBox.fromGeoPoints(mCoordinates);
    else
        return null;
    
}