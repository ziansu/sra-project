@org.junit.Test
public void testDeleteSessionByUserWhenSessionIsValidAndUserIsNotNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    sessionService.delete(testUserWithSession);
    assertNull(sessionService.getByUser(testUserWithSession));
}