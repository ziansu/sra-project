@org.junit.Test
public void pass_null_check() {
    new com.google.common.testing.NullPointerTester().setDefault(org.spine3.server.entity.RecordBasedRepository.class, org.mockito.Mockito.mock(org.spine3.server.entity.RecordBasedRepository.class)).testStaticMethods(org.spine3.server.entity.storage.Columns.class, NullPointerTester.Visibility.PACKAGE);
}