public void testAutoDiscovery() throws java.lang.Exception {
    java.util.List<com.fasterxml.jackson.databind.module.Module> mods = com.fasterxml.jackson.databind.module.ObjectMapper.findModules();
    assertEquals(0, mods.size());
}