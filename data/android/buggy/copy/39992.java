@java.lang.Override
public org.alfresco.service.cmr.repository.NodeRef execute() throws java.lang.Throwable {
    try {
        testWriteInTransaction(document);
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail();
        throw ex;
    }
    return document;
}