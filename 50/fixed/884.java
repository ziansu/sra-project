public void done() {
    if (yourTurn) {
        java.lang.System.out.println("done() was called");
        yourTurn = false;
        cp5.getController("done").setLock(true);
        sendMessage(GameMessage.DONE);
    }
}