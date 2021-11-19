@java.lang.Override
public void pauseGame() {
    this.isPaused = true;
    new com.clashsoft.dungeonrun.client.ClientSaveThread(this).start();
    this.displayGuiScreen(new com.clashsoft.dungeonrun.client.GuiPauseMenu());
}