@java.lang.Override
public void start() {
    if ((gui) == null)
        throw new java.lang.RuntimeException("Call setGUI in UTTT before starting.");
    
    for (com.theaigames.uttt.player.Player player : players) {
        sendSettings(player);
    }
    engine.setLogic(this);
    engine.start();
}