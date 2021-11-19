@org.junit.Test
public void testGetFolderByIdentifier() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.Folder result = vocabularyService.getFolderByIdentifier("test1");
    org.junit.Assert.assertNotNull("Folder", result);
}