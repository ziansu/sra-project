private void sendMove() {
    network.send(new cs451.checkers.networking.Message(new cs451.checkers.networking.MoveMessageBody(movesToSend)));
    movesToSend.clear();
}