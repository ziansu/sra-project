public void setIsCorrect(boolean correct) {
    isCorrect = correct;
    if (correct) {
        this.setIsFinished(true);
    }
}