@org.junit.Test
public void ifFileIsFromCdrSaveItToEnvelope() throws java.lang.Exception {
    eionet.webq.dao.orm.UserFile userFile = userFileServiceWillReturnUserFileFromCdr();
    publicPageController.saveXml(userFile.getId(), requestWillHaveContent());
    org.mockito.Mockito.verify(envelopeService).pushXmlFile(org.mockito.Matchers.any(eionet.webq.dao.orm.UserFile.class));
}