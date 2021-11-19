@org.junit.Test
public void testiIUniqueConceptIdentifier() throws eionet.meta.service.ServiceException {
    boolean result = vocabularyService.isUniqueConceptIdentifier("2", 3, 2);
    assertEquals("Is unique", true, result);
}