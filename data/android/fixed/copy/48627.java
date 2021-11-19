public int updateFeed(int type, int amt) {
    return feed.put(type, ((feed.get(type)) + amt));
}