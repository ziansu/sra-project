public void playNumSound(int number) {
    pauseCurrentlyPlayingAudios();
    playSound(org.scify.memori.fx.FXAudioEngine.resourceLocator.getCorrectPathForFile(this.soundBasePath, (((numBasePath) + (java.lang.String.valueOf(number))) + ".mp3")), true);
}