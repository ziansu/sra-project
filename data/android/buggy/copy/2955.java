private void addTag(java.lang.String text, int line) {
    final com.puppycrawl.tools.checkstyle.filters.SuppressWithNearbyCommentFilter.Tag tag = new com.puppycrawl.tools.checkstyle.filters.SuppressWithNearbyCommentFilter.Tag(text, line);
    tags.add(tag);
}