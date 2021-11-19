@org.junit.Test
public void createFileInvokesPart() throws java.lang.Exception {
    javax.servlet.http.Part partMock = org.mockito.Mockito.mock(javax.servlet.http.Part.class);
    fWriter.createFile("asdasd", partMock);
    org.mockito.Mockito.verify(partMock).write(org.mockito.Mockito.anyString());
}