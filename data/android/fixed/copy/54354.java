private void interpretPlayerMoves(float deltaTime) {
    handlePlayerInput(deltaTime);
    timerForPlayerTurn += deltaTime;
    if ((timerForPlayerTurn) >= 5) {
        timerForPlayerTurn -= 5.0F;
    }
}