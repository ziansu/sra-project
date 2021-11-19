@java.lang.Override
protected java.lang.String getCategoryPageUrl(final java.lang.String categoryUrl, final int page) {
    return (categoryUrl + "/") + (page * 15);
}