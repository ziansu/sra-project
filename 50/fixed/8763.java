@org.junit.Test
public void testIsFolderEmpty() throws eionet.meta.service.ServiceException {
    assertFalse("Folder empty", vocabularyService.isFolderEmpty(1));
}