public boolean applyGuess(java.lang.String letters) {
    if ((letters.length()) == 0) {
        throw new java.lang.IllegalArgumentException("No letter found");
    }
    return applyGuess(letters.charAt(0));
}