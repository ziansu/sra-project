public void add(uk.co.amlcurran.queues.core.QueueItem queueItem) {
    queueSource.add(queueItem);
    int position = java.lang.Math.max(0, ((queueSource.size()) - 1));
    notifyItemInserted(position);
}