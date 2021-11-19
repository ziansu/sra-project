@java.lang.Override
public void close() throws java.io.IOException {
    if (!(frameInfo.isFinished())) {
        flush();
        writeEndMark();
    }
    super.close();
}