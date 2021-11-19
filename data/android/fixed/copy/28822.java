@org.junit.Test
public void storeAndRecover() throws java.io.IOException, org.exist.EXistException, org.exist.collections.CollectionConfigurationException, org.exist.security.PermissionDeniedException, org.exist.util.DatabaseConfigurationException, org.exist.util.LockException, org.xml.sax.SAXException {
    storeDocuments();
    restart();
    remove();
}