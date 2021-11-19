public void startAIMatch() {
    while (!(currentState.mustLose())) {
        updateGuiIfAny();
        playCPU();
        passToNextPlayer();
    } 
    currentPlayerDefeated();
}