public boolean isSfidaRound() {
    int currentWord = ((currentPosition) % 5) + 1;
    return (currentWord == 5) || ((java.util.Arrays.binarySearch(currentCard.getSpeciali(), currentWord)) >= 0);
}