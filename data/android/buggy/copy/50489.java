@org.junit.Test
public void testGetVocabularyWorkingCopy() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyWorkingCopy(2);
    org.junit.Assert.assertNotNull("Expected vocabulary folder", result);
}