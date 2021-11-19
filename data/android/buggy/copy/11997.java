private long extractNodeIDFromWayLine(java.lang.String line) throws java.lang.NumberFormatException {
    java.lang.String attributeName = "ref";
    return java.lang.Long.parseLong(extractUniqueAttribute(line, attributeName));
}