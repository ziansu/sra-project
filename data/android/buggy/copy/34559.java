@java.lang.Override
public void update(double deltaMillis) {
    addPendingObjects();
    handleInput(deltaMillis);
    handleCharacterDrowning();
    checkTeamStatus();
    updateObjects(deltaMillis);
    updateTurn(deltaMillis);
    removeExpiredObjects();
    sketchwars.game.Input.handleGameInput();
}