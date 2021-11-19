@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testGetSourceNotAvailable() throws java.lang.Exception {
    yangLibrarySchemaYangSourceProvider.getSource(org.opendaylight.yangtools.yang.model.repo.api.RevisionSourceIdentifier.create("aaaaa", "0000-00-00"));
}