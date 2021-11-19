public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    if ((mRoomId) != null) {
        Games.RealTimeMultiplayer.leave(getClient(), this, mRoomId);
        mRoomId = null;
    }
}