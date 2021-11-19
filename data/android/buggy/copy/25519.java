public int getIntValue(final java.lang.String key) {
    java.lang.String value = getStringValue(key);
    return !(value.equals(null)) ? java.lang.Integer.parseInt(getStringValue(key)) : 0;
}