@org.junit.Test
public void testCheckSessionStateOnValidSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    assertNotNull(sessionService.checkState(testSession));
}