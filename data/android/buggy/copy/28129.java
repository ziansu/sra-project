public static void ChangeState(states.State requestedState) {
    states.State newState = null;
    newState = requestedState;
    states.StateManager.guiFrame.remove(states.StateManager.currentState);
    newState.createGUI();
    states.StateManager.guiFrame.add(newState);
    states.StateManager.guiFrame.validate();
}