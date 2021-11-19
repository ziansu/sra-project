private java.lang.String extractRoadName(java.lang.String line) {
    java.lang.String attributeName = "v";
    try {
        java.lang.String rawName = extractUniqueAttribute(line, attributeName);
        return rawName.replace(' ', '~');
    } catch (java.util.InputMismatchException ex) {
        return null;
    }
}