@java.lang.Override
public void onRequestCompleted(java.lang.Boolean result) {
    assertNotNull(result);
    assertEquals(result, new java.lang.Boolean(true));
    assertTrue(result);
    signal.countDown();
}