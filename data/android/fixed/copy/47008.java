private void checkIfFinished() {
    if ((mScore) == 0) {
        createGameOver(false);
    }else
        if ((mNumberOfQuestions) >= (MAX_QUESTIONS)) {
            createGameOver(true);
        }
    
}