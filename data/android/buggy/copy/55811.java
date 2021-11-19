@org.junit.Test
@org.junit.Ignore(value = "IntegrationTest")
public void importIntegrationTestGpLogins_staging() throws java.lang.Exception {
    org.patientview.importer.controller.ImportControllerTest.post(getFileFromString("data/xml/gplogin_test_2/p7-2.xml"));
}