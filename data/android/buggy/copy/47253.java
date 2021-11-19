private boolean hasPattern(java.util.Set<java.lang.String> paths) {
    return org.osgl.util.S.join("", paths).contains("*");
}