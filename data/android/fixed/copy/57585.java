public void setState(gui.state.State newState) {
    currentState = newState;
    currentState.setPage(this);
}