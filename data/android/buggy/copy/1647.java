public java.util.Collection<org.vamdc.portal.session.queryBuilder.forms.QueryForm> getForms() {
    synchronized(forms) {
        return forms;
    }
}