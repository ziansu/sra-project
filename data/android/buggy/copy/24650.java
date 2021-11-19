@org.junit.Test(timeout = 5000)
public void testCreateTemporaryTopicFailsWhenLinkRefusedAndAttachResponseWriteIsDeferred() throws java.lang.Exception {
    doCreateTemporaryDestinationFailsWhenLinkRefusedTestImpl(false, true);
}