public float getFloat(java.lang.String name) {
    return java.lang.Float.parseFloat(getString(name).replaceAll("\\s+", ""));
}