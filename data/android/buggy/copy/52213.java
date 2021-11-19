@org.junit.Test
public void testSearchVocabularyConcepts() throws eionet.meta.service.ServiceException {
    eionet.meta.service.data.VocabularyConceptFilter filter = new eionet.meta.service.data.VocabularyConceptFilter();
    filter.setVocabularyFolderId(3);
    eionet.meta.service.data.VocabularyConceptResult result = vocabularyService.searchVocabularyConcepts(filter);
    org.junit.Assert.assertEquals("Result size", 2, result.getFullListSize());
}