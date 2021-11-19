public void popCurrentState() {
    if (!(states.empty())) {
        states.pop();
        states.peek().resume();
    }
}