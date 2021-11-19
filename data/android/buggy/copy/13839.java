private void calculateGrowths() {
    for (int i = 0; i <= 7; i++) {
        growths[i] = (myCharacter.getGrowths(i)) + (myJob.getGrowths(i));
    }
}