private synchronized int getDataPublisherIndex() {
    int index = currentDataPublisherIndex.getAndIncrement();
    if (index == (maximumDataPublisherIndex.get())) {
        currentDataPublisherIndex.set(START_INDEX);
    }
    return index;
}