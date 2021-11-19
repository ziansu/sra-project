@org.testng.annotations.AfterClass(alwaysRun = true)
public void destroy() throws java.lang.Exception {
    super.cleanUp();
    apiIdentifier = new org.wso2.carbon.apimgt.api.model.APIIdentifier(providerName, API_NAME, org.wso2.am.integration.tests.api.lifecycle.RegistryLifeCycleInclusionTest.API_VERSION_2_0_0);
    deleteAPI(apiIdentifier, apiPublisherClientUser1);
}