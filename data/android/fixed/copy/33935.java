@java.lang.Override
public void run() throws java.lang.Exception {
    long actualCount = 0;
    for (com.hazelcast.simulator.tests.topic.ReliableTopicTest.MessageListenerImpl topicListener : listeners) {
        actualCount += topicListener.received.get();
    }
    org.junit.Assert.assertEquals("published messages don't match received messages", expectedCount, actualCount);
}