@org.junit.Test
public void testUnload() {
    assertNotNull(loader.getMachineInterface("Cupcake Basic"));
    loader.unload();
    assertFalse(loader.isLoaded());
}