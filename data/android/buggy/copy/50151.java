@org.junit.Test
public void testProducerPublishMethodInvoked() {
    responder.send(payload);
    org.mockito.Mockito.verify(mockProducer, org.mockito.Mockito.times(1)).publish(org.mockito.Matchers.anyObject());
}