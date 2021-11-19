@org.junit.Test
public void doStartShouldStartANewSmppSession() throws java.lang.Exception {
    doStartExpectations();
    org.easymock.classextension.EasyMock.replay(endpoint, session);
    producer.doStart();
    org.easymock.classextension.EasyMock.verify(endpoint, session);
}