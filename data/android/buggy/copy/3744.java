public void run() {
    time_.incrementAndGet();
    if (time_.equals(new java.util.concurrent.atomic.AtomicInteger(src.model.PlayModel.GAME_TIME))) {
        setChanged();
        notifyObservers(new java.lang.Integer(getPointCount()));
    }
}