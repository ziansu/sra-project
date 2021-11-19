@java.lang.Override
public void resume(combatgame.state.StateManager stateManager) {
    combatgame.state.Game.shouldScale(true);
    this.stateManager = stateManager;
}