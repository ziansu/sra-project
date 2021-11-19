private java.lang.Object readResolve() {
    if ((includeRegex) != null) {
        includePattern = java.util.regex.Pattern.compile(includeRegex);
    }
    initColumns();
    initJobFilters();
    return this;
}