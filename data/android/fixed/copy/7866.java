@org.junit.Test
public void testForceCompleteFromPending() {
    assertTrue(block.isPending());
    block.forceComplete();
    when(mockReconciler.isReconciled()).thenReturn(true);
    assertTrue(block.isComplete());
}