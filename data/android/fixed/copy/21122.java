@org.junit.Test
public void testCheckSessionStateOnExpiredSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    testSession.expire();
    assertNull(sessionService.checkState(testSession));
}