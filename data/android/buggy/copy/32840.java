@org.junit.Test
public void testStartsPending() {
    assertTrue(block.isPending());
    assertTrue(block.getMessage().contains("pending"));
    org.mockito.Mockito.verifyZeroInteractions(mockReconciler);
}