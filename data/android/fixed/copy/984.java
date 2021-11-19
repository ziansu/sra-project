private boolean isExcludable(java.lang.String url) {
    if ((pattern) != null) {
        java.util.regex.Matcher matcher = pattern.matcher(url);
        return matcher.find();
    }
    return false;
}