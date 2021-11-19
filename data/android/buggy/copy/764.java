@java.lang.Override
public void run() {
    sound.open();
    (sound.SoundManager.manager.soundsPlaying)++;
    sound.play();
}