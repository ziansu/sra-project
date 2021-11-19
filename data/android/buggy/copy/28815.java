public void done() {
    if (yourTurn) {
        yourTurn = false;
        cp5.getController("done").setLock(true);
        sendMessage(GameMessage.END_TURN);
    }
}