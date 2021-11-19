public static de.fau.cs.osr.utils.TestResourcesFixture getTestResourcesFixture() {
    try {
        java.io.File path = de.fau.cs.osr.utils.TestResourcesFixture.resourceNameToFile(org.sweble.wikitext.engine.utils.EngineIntegrationTestBase.class, "/");
        return new de.fau.cs.osr.utils.TestResourcesFixture(path);
    } catch (java.io.FileNotFoundException e) {
        throw new de.fau.cs.osr.utils.WrappedException(e);
    }
}