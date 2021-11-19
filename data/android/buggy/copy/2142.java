public java.lang.String LoadLocalClaims() {
    this.isNetworkConnected();
    if (!(persistanceController.DataManager.isNetworkAvailable())) {
        local.LoadClaims();
    }
    return null;
}