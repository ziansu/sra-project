public void startAIMatch() {
    while (!(currentState.mustLose())) {
        updateGuiIfAny();
        playCPU();
    } 
    currentPlayerDefeated();
}