public org.elasticsearch.common.geo.GeoPoint getValue() {
    int numValues = values.count();
    if (numValues == 0) {
        return null;
    }
    return values.valueAt(0);
}