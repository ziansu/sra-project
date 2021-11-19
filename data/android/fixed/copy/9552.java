private java.lang.String formatTag(java.lang.String tag) {
    if (!(tag.startsWith("#"))) {
        tag = "#" + tag;
    }
    return tag;
}