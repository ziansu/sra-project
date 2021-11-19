public com.applitools.eyes.Region scale(double scaleRatio) {
    return new com.applitools.eyes.Region(getLocation().scale(scaleRatio), getSize().scale(scaleRatio));
}