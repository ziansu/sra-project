@java.lang.Override
public void onRequestCompleted(java.lang.Boolean result) {
    assertNotNull(result);
    assertTrue(result);
    signal.countDown();
}