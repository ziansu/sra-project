public void testQuitCorrect() {
    common.messages.MessageType message = new common.messages.MessageType("quit");
    assertEquals("quit", message.getMsg());
    assertEquals("quit", message.getHeader());
    assertTrue(message.isValid);
}