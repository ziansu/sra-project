public kg.nais.models.Client getClient() {
    if ((clientId) != 0) {
        client = new kg.nais.facade.ClientFacade().findById(clientId);
    }
    return client;
}