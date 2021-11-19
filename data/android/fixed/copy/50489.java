@org.junit.Test
public void testGetVocabularyWorkingCopy() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyWorkingCopy(2);
    assertNotNull("Expected vocabulary folder", result);
}