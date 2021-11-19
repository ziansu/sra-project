@org.junit.Test
public void vocabularyBindingExistsTest() throws eionet.meta.service.ServiceException {
    org.junit.Assert.assertTrue(vocabularyService.vocabularyHasDataElementBinding(1, 1));
    org.junit.Assert.assertTrue((!(vocabularyService.vocabularyHasDataElementBinding(1, 2))));
}