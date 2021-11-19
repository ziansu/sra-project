public void setCurrentUrl(java.lang.String currentUrl) {
    if (((this.currentUrl) != null) && (this.currentUrl.equals(currentUrl))) {
        return ;
    }
    this.lastUrl = this.currentUrl;
    this.currentUrl = currentUrl;
}