public boolean isTagEnabled(java.lang.String tag) {
    try {
        return mService.isTagEnabled(tag);
    } catch (android.os.RemoteException e) {
        return false;
    }
}