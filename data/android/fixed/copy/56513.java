public void start() {
    javattt.TransitionData result = null;
    while ((stage) != (Stage.halt)) {
        result = transition(result);
    } 
}