@org.junit.Test
public void testGetSessionByTokenWhenTokenIsValid() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByToken(testSession.getToken());
    assertNotNull("Failure - Expected Not null", session);
}