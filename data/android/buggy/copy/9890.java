public float getFloatPropertyValue(java.lang.String property) {
    int i = getPropertyIndex(property);
    if (i >= 0) {
        return floatProperties[i];
    }
    return 0;
}