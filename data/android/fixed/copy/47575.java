@java.lang.Override
public void write(int oneByte) throws java.io.IOException {
    stream.write(oneByte);
    timeStat.progressTick((1.0F / ((float) (contentSize))));
}