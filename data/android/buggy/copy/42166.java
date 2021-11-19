public void start() throws model.InterpreterException {
    turnedOff = false;
    reset = false;
    view.setStartState();
    interpThread = new model.Interpreter.InterpreterThread();
    currentTape.setContent(view.getTapeInput());
}