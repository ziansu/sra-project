@org.gbif.occurrence.persistence.Test
public void testDeleteNotExists() {
    org.gbif.api.model.occurrence.Occurrence occ = occurrenceService.delete(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    assertNull(occ);
}