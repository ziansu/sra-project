@org.junit.Test
public void testExecuteSomeFast() throws java.io.IOException {
    lombok.val importer = org.icgc.dcc.repository.client.core.RepositoryImporterTest.createImporter(org.icgc.dcc.repository.client.core.AWS, org.icgc.dcc.repository.client.core.COLLAB, org.icgc.dcc.repository.client.core.PCAWG);
    importer.execute();
}