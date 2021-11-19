@org.junit.Test
public void testGetSessionByUserWhenExpired() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    sessionService.expire(testSession);
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByUser(testUserWithSession);
    assertNull(session);
}