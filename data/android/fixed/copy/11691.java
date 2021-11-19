@org.junit.Test
public void testGetFolderByIdentifier() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.Folder result = vocabularyService.getFolderByIdentifier("test1");
    assertNotNull("Folder", result);
}