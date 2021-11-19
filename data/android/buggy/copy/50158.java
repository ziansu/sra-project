public java.util.Set<java.lang.String> getGifURLs(java.lang.String term) {
    java.util.Set<java.lang.String> set = jedis.smembers(urlSetKey(term));
    return set;
}