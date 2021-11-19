public org.eclipse.leshan.server.registration.Registration getCurrentRegistration() {
    return server.getRegistrationService().getByEndpoint(currentEndpointIdentifier);
}