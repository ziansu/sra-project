@org.junit.Test
public void configurePlayer() {
    com.psu.capstonew17.backend.api.VideoManager manager = com.psu.capstonew17.backend.data.ExternalVideoManager.getInstance(context);
    com.psu.capstonew17.backend.api.Video video = new com.psu.capstonew17.backend.api.stubs.VideoStub();
    android.media.MediaPlayer player = new android.media.MediaPlayer();
    video.configurePlayer(player);
}