public void stop() {
    receive(new record.wave.RealBufferWaveRecorder.PoisonPill());
    mRunning.set(false);
}