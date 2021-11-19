@java.lang.Override
public void update(double deltaMillis) {
    sketchwars.game.Input.handleGameInput();
    addPendingObjects();
    handleInput(deltaMillis);
    handleCharacterDrowning();
    checkTeamStatus();
    updateObjects(deltaMillis);
    updateTurn(deltaMillis);
    removeExpiredObjects();
}