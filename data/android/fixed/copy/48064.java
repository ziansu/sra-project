public void setWebAddress(java.net.URI webAddress) {
    biocode.fims.entities.Bcid.isValidUrl(webAddress);
    this.webAddress = webAddress;
}