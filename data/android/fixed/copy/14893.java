@org.junit.Before
public void setup() {
    goConfigService = mock(com.thoughtworks.go.server.service.GoConfigService.class);
    securityService = mock(com.thoughtworks.go.server.service.SecurityService.class);
    entityHashingService = mock(com.thoughtworks.go.server.service.EntityHashingService.class);
    service = new com.thoughtworks.go.server.service.TemplateConfigService(goConfigService, securityService, entityHashingService);
}