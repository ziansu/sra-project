public void setCredentials(microsoft.exchange.webservices.data.credential.ExchangeCredentials credentials) {
    this.credentials = credentials;
    this.useDefaultCredentials = false;
    initializeHttpContext();
}