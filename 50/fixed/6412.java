public void addHashTag(java.lang.String hashtag) {
    java.util.Set<java.lang.String> hashtags = new java.util.HashSet<java.lang.String>(getHashTags());
    hashtags.add(hashtag);
    setHashTags(hashtags);
}