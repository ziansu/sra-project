@org.junit.Before
public void initObjects() {
    try {
        musicPlayer = new mainFrame.MusicPlayer("single_round_no_music.wav");
        assertNotNull(musicPlayer);
    } catch (javax.sound.sampled.LineUnavailableException | java.io.IOException | javax.sound.sampled.UnsupportedAudioFileException e) {
        fail();
    }
}