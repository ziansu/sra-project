@org.junit.Test
public void testGetHandler() {
    restrSaveCmd.injected_Handler(null);
    assertNotNull(restrSaveCmd.getHandler());
    assertEquals("Expecting RestructureSaveHandler handler.", com.celements.navigation.cmd.ReorderSaveHandler.class, restrSaveCmd.getHandler().getClass());
}