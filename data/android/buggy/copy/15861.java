public void setNonselectableTags(java.lang.String tags) {
    if (!(org.zkoss.lang.Objects.equals(_nonselTags, tags))) {
        _nonselTags = tags;
        smartUpdate("nonselectableTags", tags);
    }
}