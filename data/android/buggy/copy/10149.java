public void setUseDefaultCredentials(boolean value) {
    this.useDefaultCredentials = value;
    if (value) {
        this.credentials = null;
    }
    initializeHttpContext();
}