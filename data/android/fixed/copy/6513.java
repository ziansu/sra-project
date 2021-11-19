public int getPropAsInt(java.lang.String key, int def) {
    return java.lang.Integer.parseInt(getProperty(key, java.lang.String.valueOf(def)));
}