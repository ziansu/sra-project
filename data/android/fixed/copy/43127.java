@org.junit.Test
public void testGetSessionByTokenWhenTokenIsNotValid() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByToken("testToken");
    assertNull("Failure - Expected null", session);
}