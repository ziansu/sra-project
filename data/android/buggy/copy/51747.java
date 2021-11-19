@org.junit.After
public void tearDown() throws java.lang.Exception {
    org.openflexo.foundation.OpenflexoTestCase.serviceManager.stopAllServices();
    org.openflexo.kvc.KeyValueLibrary.clearCache();
}