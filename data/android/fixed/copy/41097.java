public void start() {
    mixCount = 0;
    started.set(true);
    scheduler.submit(insideMixer, PriorityQueueScheduler.MIXER_MIX_QUEUE);
    scheduler.submit(outsideMixer, PriorityQueueScheduler.MIXER_MIX_QUEUE);
}