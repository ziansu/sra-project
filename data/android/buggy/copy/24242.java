public void set(int targetFps, int targetUps) {
    this.targetFps = targetFps;
    this.targetFps = targetUps;
    nanoFps = 1000000000 / targetFps;
    nanoUps = 1000000000 / targetUps;
}