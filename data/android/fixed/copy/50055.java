private void findEditDistance() {
    for (java.lang.String inputWord : wordsNotFound) {
        findSimilarAlternation(inputWord);
        findSimilarDeletion(inputWord);
        findSimilarInsertion(inputWord);
        findSimilarTransposition(inputWord);
    }
    swapNotFoundLists();
}