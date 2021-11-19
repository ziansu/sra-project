@org.junit.Test
public void testCheckSessionStateOnExpiredSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    testSession.expire();
    org.junit.Assert.assertNull(sessionService.checkState(testSession));
}