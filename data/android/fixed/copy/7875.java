public void stop() {
    if (this.started.get()) {
        started.set(false);
        mixer.cancel();
    }
}