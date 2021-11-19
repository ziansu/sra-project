@java.lang.Override
public long getDuration(final org.apache.reef.wake.time.Time time) {
    this.isReady(time);
    return 0;
}