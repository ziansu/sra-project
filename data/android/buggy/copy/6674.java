public void minimize() {
    if (this.isInfoWindowShown()) {
        this.closeInfoWindow();
    }
    this.setInfoWindow(minimizedInfoWindow);
    this.showInfoWindow();
}