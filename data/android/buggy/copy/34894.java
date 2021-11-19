public boolean isStillValid() {
    return (((java.lang.System.currentTimeMillis()) / 1000L) - (playlistTime)) < (PandoraRadio.PLAYLIST_VALIDITY_TIME);
}