@org.junit.Test
public void testFragmentGood() {
    java.lang.String fragment = occurrenceService.getFragment(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    org.junit.Assert.assertEquals(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.XML, fragment);
}