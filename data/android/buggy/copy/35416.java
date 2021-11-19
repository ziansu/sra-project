public void gamePause() {
    this.pause();
    nitrogene.core.CursorSystem.changeCursor("redfire");
    isPauseLocked = true;
}