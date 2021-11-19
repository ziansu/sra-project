@java.lang.Override
public void addValue(long timestamp, long value) throws java.io.IOException {
    write.lock();
    writeDataPoint(timestamp, value);
    write.unlock();
}