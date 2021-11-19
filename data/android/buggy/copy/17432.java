@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.d(LOG_TAG, "InstagramService started **********");
    getLikedUsers();
    getBestFriends(likedUsers);
    getInstagramFeed();
}