public static void assertNotContainsDestination(java.lang.String message, com.pronoia.junit.activemq.EmbeddedActiveMQBroker broker, java.lang.String expected) {
    org.junit.Assert.assertFalse(message, (null != (broker.getDestination(expected))));
}