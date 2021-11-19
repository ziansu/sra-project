public int getFriendListVersion() {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(preferenceFileName, Context.MODE_PRIVATE);
    return sharedPreferences.getInt("friendListVersion", 0);
}