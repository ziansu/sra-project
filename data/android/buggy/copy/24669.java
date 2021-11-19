public void slideLevel(com.servioticy.dispatcher.Level level) {
    this.lastPair = level.lastPair;
    int maxSize = this.levelBucket.getMaxSize();
    this.levelBucket = level.levelBucket;
    this.levelBucket.setMaxSize(maxSize);
}