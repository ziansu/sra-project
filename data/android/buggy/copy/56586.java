public void setContainer(java.lang.String container) {
    container = container.toLowerCase();
    this.container = cmanager.Geocache.CONTAINER.getLC(container);
}