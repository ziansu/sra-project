@java.lang.Override
public void logSentData(byte[] b) {
    synchronized(sentMessages) {
        sentMessages.add(b);
    }
}