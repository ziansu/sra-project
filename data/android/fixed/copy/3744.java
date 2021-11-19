public void run() {
    time_.incrementAndGet();
    if ((time_.get()) == (src.model.PlayModel.GAME_TIME)) {
        setChanged();
        notifyObservers(new java.lang.Integer(getPointCount()));
    }
}