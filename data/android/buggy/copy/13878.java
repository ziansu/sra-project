public boolean isOwned() {
    return isOwned(mConnection.getUser().toString());
}