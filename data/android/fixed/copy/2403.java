private java.lang.String formatName(java.lang.String name) {
    name = name.replaceAll("[^a-zA-Z0-9_]", "");
    return name;
}