public void testQuitCorrect() {
    common.messages.MessageType message = new common.messages.MessageType("quit", false);
    assertTrue(message.isValid);
    assertEquals("quit", message.getHeader());
    assertEquals("quit", message.getMsg());
}