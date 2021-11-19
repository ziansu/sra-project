public void playNext(long id) {
    (queueStack)++;
    queue.add(((data.currentQueueIndex()) + 1), id);
    (queueCount)++;
    log();
}