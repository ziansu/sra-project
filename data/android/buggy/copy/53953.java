protected java.lang.String getContextIdForAccessOutcome(org.restlet.Response response) {
    return org.forgerock.openam.audit.context.AuditRequestContext.getProperty(org.forgerock.openam.rest.audit.CONTEXT_ID);
}