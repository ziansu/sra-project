private org.auraframework.service.ContextService establishAuraContext() {
    org.auraframework.service.ContextService contextService = org.auraframework.Aura.getContextService();
    if (!(contextService.isEstablished())) {
        contextService.startContext(Mode.PTEST, Format.JSON, Authentication.AUTHENTICATED);
    }
    return contextService;
}