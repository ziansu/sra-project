@org.gbif.occurrence.persistence.Test
public void testFragmentNull() {
    java.lang.String fragment = occurrenceService.getFragment(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    assertNull(fragment);
}