public void playLetterSound(int number) {
    pauseCurrentlyPlayingAudios();
    playSound((((letterBasePath) + number) + ".mp3"), true);
}