public void saveLastState() throws java.io.IOException, java.lang.Exception {
    java.lang.String currentState = LemonBuddy.FileStorage.readStringAsString(LemonBuddy.CommandExecutor.path);
    lastStates.push(currentState);
    lastState = currentState;
    undoneStates = new java.util.Stack<java.lang.String>();
}