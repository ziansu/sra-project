private java.lang.String removeJmsModule(java.lang.String destination) {
    java.lang.String destName = org.apache.commons.lang.StringUtils.substringAfter(destination, "!");
    return destName.equals("") ? destination : destName;
}