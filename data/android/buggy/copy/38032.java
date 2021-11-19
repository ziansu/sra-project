public com.applitools.eyes.Region scale(double scaleRatio) {
    com.applitools.eyes.Location l = getLocation();
    l.scale(scaleRatio);
    com.applitools.eyes.RectangleSize s = getSize();
    s.scale(scaleRatio);
    return new com.applitools.eyes.Region(l, s);
}