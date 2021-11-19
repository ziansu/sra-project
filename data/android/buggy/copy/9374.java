public void setCurrentState(int currentState, com.wolf.engine.core.Engine e) {
    this.currentState = currentState;
    states.get(currentState).init(e);
}