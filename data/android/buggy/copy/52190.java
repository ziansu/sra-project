@java.lang.Override
public void run() {
    java.lang.System.out.println("Interstitial app closed");
    resetWorld();
    faderShaderTimer = 0;
    gameState = GameState.START;
}