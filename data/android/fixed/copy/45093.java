@org.junit.Test
public void testSaveNominal() throws org.yj.smtpstub.exception.IncompleteEmailException {
    assertNotNull(store);
    store.save(sampleEmail);
}