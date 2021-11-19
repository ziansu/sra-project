public synchronized void spectate(poker.HeadsUpHand hand, poker.HeadsUpPokerGame game, int streetIn, java.lang.String message) {
    clearMessages();
    addMessage(message);
    hand.printBoard(streetIn, game.handNumber, this);
    send();
    clearMessages();
}