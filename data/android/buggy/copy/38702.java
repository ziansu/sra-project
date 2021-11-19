@org.junit.Test
public void testInjected_Handler() {
    restrSaveCmd.injected_Handler(mockHandler);
    assertNotNull(restrSaveCmd.getHandler(context));
    assertSame("Expecting injected handler object.", mockHandler, restrSaveCmd.getHandler(context));
}