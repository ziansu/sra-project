private Utils.StringNumberPair[] getAltitudePresets() {
    if (useMetric) {
        return com.airmap.airmapsdk.Utils.getAltitudePresetsMetric();
    }
    return getAltitudePresets();
}