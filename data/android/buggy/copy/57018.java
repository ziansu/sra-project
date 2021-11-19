@java.lang.Override
public void setDockerAuthenticationFlow(org.keycloak.models.AuthenticationFlowModel flow) {
    getDelegateForUpdate();
    updated.setClientAuthenticationFlow(flow);
}