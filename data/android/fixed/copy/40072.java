@org.junit.Test
public void testStartupBootstrappingNoIntegrations() {
    org.mockito.Mockito.when(this.context.getBeansOfType(org.symphonyoss.integration.Integration.class)).thenReturn(null);
    this.integrationBootstrapContext.initIntegrations();
    assertNull(this.integrationBootstrapContext.getIntegrationById(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.CONFIGURATION_ID));
}