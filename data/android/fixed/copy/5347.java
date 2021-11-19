public static java.lang.String removeTabs(java.lang.String in) {
    if (in != null) {
        return in.replaceAll("[\n\r\t]+", " ");
    }else {
        return null;
    }
}