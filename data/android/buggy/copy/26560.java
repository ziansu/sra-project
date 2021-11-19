public void stop() {
    started = false;
    insideMixer.cancel();
    outsideMixer.cancel();
}