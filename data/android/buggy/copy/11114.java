@org.junit.After
public void tearDown() throws java.lang.Exception {
    if (m_fileAnticipator.isInitialized()) {
        m_fileAnticipator.deleteExpected();
    }
    m_fileAnticipator.tearDown();
}