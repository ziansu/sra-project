public java.lang.String getAuthenticationToken() {
    return context.getBean(org.talend.dataprep.security.Security.class).getAuthenticationToken();
}