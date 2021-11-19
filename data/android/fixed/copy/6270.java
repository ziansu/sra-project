private void dropCurrentConnection() {
    if ((mCurrentConnectionRef) != null) {
        mCurrentConnectionRef.removeValue();
        mCurrentConnectionRef = null;
        mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
        mCurrentLastOnlineRef = null;
    }
}