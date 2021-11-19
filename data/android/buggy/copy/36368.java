@java.lang.Override
public java.util.List<org.protege.editor.owl.client.Project> getProjects() throws org.protege.editor.owl.client.api.exception.ClientRequestException {
    try {
        return getProjects(userId);
    } catch (org.protege.editor.owl.server.api.exception.AuthorizationException | java.rmi.RemoteException e) {
        throw new org.protege.editor.owl.client.api.exception.ClientRequestException(e.getMessage(), e);
    }
}