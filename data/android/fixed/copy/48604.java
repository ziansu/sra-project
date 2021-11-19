public boolean getBool(java.lang.String name) {
    return java.lang.Boolean.parseBoolean(getString(name).replaceAll("\\s+", ""));
}