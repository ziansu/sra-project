public void setTags(java.lang.String tags) {
    if (tags != null) {
        mTagsString = tags;
        mTags = com.zzheads.blog.model.BlogEntry.getTagsSplit(tags);
    }
}