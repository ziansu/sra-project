public float getFloatPropertyValue(java.lang.String property) {
    int i = getPropertyIndex(property);
    if ((i >= 0) && ((floatProperties) != null)) {
        return floatProperties[i];
    }
    return 0;
}