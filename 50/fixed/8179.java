public void removeUser(com.iskrembilen.quasseldroid.IrcUser user) {
    for (com.iskrembilen.quasseldroid.IrcMode mode : com.iskrembilen.quasseldroid.IrcMode.values()) {
        removeUserFromModeList(mode, user);
    }
    notifyObservers(R.id.BUFFERUPDATE_USERSCHANGED);
}