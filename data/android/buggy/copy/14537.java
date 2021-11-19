public void start(samza.examples.rss.system.RSSFeed.RSSFeedListener listener) {
    logger.debug("RSSFeed system start to work!");
    if (listener != null) {
        java.lang.String content = download();
        samza.examples.rss.system.RSSFeed.RSSFeedEvent event = new samza.examples.rss.system.RSSFeed.RSSFeedEvent(content);
        listener.onEvent(event);
    }
}