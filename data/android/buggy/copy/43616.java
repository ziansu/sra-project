public void checkBlacklist(java.lang.Integer storeID, java.lang.String storeToken, appaloosa_store.com.appaloosa_android_tools.tools.interfaces.ApplicationAuthorizationActivity listeningActivity) {
    this.activity = listeningActivity;
    appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.CheckBlacklistService.checkBlacklist(storeID, storeToken, listeningActivity);
}