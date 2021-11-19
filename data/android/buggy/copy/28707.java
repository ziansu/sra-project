public float getFloat(java.lang.String name) {
    return java.lang.Float.parseFloat(data.get(name).replaceAll("\\s+", ""));
}