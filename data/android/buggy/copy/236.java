public void pause() {
    paused = true;
    alSourcePause(srcNames.get(0));
}