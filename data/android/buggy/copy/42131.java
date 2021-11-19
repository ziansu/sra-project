public void setTags(java.lang.String tags) {
    mTagsString = tags;
    mTags = com.zzheads.blog.model.BlogEntry.getTagsSplit(tags);
}