@org.junit.Test
public void testGetVocabularyFolderByIdentifier() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyFolder("common", "test_vocabulary2", true);
    org.junit.Assert.assertEquals("Expected id", 3, result.getId());
}