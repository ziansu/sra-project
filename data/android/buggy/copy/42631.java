public void start() {
    mixCount = 0;
    started = true;
    scheduler.submit(mixer, PriorityQueueScheduler.MIXER_MIX_QUEUE);
}