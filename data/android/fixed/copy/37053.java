public int getInt(java.lang.String name) {
    return java.lang.Integer.parseInt(getString(name).replaceAll("\\s+", ""));
}