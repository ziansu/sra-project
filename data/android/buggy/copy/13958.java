@org.junit.Test
public void testGetSessionByTokenWhenTokenIsNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByToken(null);
    org.junit.Assert.assertNull("Failure - Expected null", session);
}