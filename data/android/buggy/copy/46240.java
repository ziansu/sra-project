public boolean checkPlayerInPut(int input) {
    if (input == (simonSequence[checkAnswer])) {
        return true;
    }else {
        gameOver();
        return false;
    }
}