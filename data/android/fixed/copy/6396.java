public void NewWordClicked(android.view.View Sender) {
    selectedWord = wordGenerator.nextWord(selectedLength).toUpperCase();
    scrambledWord = edu.westga.rnrscramble.model.WordScrambler.Scramble(selectedWord);
    setScrambleTextView(scrambledWord);
    setAnswerTextView("");
}