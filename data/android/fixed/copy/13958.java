@org.junit.Test
public void testGetSessionByTokenWhenTokenIsNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByToken(null);
    assertNull("Failure - Expected null", session);
}