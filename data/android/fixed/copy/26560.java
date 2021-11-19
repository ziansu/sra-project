public void stop() {
    if (this.started.get()) {
        started.set(false);
        insideMixer.cancel();
        outsideMixer.cancel();
    }
}