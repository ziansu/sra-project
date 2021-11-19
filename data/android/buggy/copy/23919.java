private static boolean isEndsWithZip(java.lang.String filename) {
    if (org.springframework.util.StringUtils.isEmpty(filename)) {
        return false;
    }
    filename = filename.trim().toLowerCase();
    return filename.endsWith(".zip");
}