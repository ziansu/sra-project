private void correctGuess() {
    updateKnownWord();
    println((("Awesome " + (guess)) + " is in the word"));
    println(("Here is what the word looks like now: " + (knownWord)));
}