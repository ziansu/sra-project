public void resume() {
    paused = false;
    alSourcePlay(srcNames.get(0));
}