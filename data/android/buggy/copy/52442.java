@org.junit.Test
public void testGetVerbatimNull() {
    org.gbif.api.model.occurrence.VerbatimOccurrence verb = occurrenceService.getVerbatim(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    org.junit.Assert.assertNull(verb);
}