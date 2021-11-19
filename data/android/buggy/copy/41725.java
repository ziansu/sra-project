private long utcNanos() {
    long nanos = (net.time4j.SystemClock.MONOTON_MODE) ? java.lang.System.nanoTime() : net.time4j.SystemClock.PROVIDER.getNanos();
    long utc = java.lang.Math.addExact(nanos, this.offset);
    assert utc > 0;
    return utc;
}