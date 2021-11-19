public void loadAllOnlineData() {
    android.util.Log.d("WeFriends", "Loading All Data.");
    asyncTask.retrieveAndHandleNewMessages();
    asyncTask.loadOnlineFriendList();
    initNotifierService();
}