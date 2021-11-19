@org.junit.Test
public void testUnload() {
    assertTrue(loader.getMachineInterface("Cupcake Basic"));
    loader.unload();
    assertFalse(loader.isLoaded());
}