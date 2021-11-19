public java.lang.Object getLastMessage() {
    synchronized(lock) {
        if (messages.isEmpty()) {
            waitForMessage();
        }
        org.junit.Assert.assertFalse(messages.isEmpty());
        return messages.get(0);
    }
}