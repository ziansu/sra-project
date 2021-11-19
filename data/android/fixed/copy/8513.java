@java.lang.Override
public void run() {
    stopMusic();
    music = manager.getResourceLoader().getMusic((("data/audio/music/" + musicName) + ".mp3"));
    startMusic(looping);
}