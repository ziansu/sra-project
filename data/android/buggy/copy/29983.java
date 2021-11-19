@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    com.vincent.easymusic.EasyMusicMainActivity.mediaPlayer.start();
    com.vincent.easymusic.EasyMusicMainActivity.positionPlay = position;
    com.vincent.easymusic.EasyMusicMainActivity.isMusicPlaying = true;
    com.vincent.easymusic.EasyMusicMainActivity.setMusicViewInfos();
}