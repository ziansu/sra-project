@org.gbif.occurrence.persistence.Test
public void testFragmentGood() {
    java.lang.String fragment = occurrenceService.getFragment(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    assertEquals(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.XML, fragment);
}