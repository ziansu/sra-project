public static void clearQueue() {
    try {
        if ((com.naman14.timber.MusicPlayer.mService) != null)
            com.naman14.timber.MusicPlayer.mService.removeTracks(0, java.lang.Integer.MAX_VALUE);
        
    } catch (final android.os.RemoteException ignored) {
    }
}