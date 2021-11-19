public static void clearQueue() {
    try {
        com.naman14.timber.MusicPlayer.mService.removeTracks(0, java.lang.Integer.MAX_VALUE);
    } catch (final android.os.RemoteException ignored) {
    }
}