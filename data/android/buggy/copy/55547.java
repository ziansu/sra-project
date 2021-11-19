public static java.lang.String getImgSuffix(java.lang.String imgFileName) {
    java.lang.String suffix = getFileSuffix(imgFileName);
    return suffix == null ? "jpg" : suffix;
}