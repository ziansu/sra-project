public void stop() {
    if (timer.isActive()) {
        org.waveprotocol.box.stat.Timing.enterScope(values);
        org.waveprotocol.box.stat.Timing.stop(timer);
    }
}