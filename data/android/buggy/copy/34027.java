public void replaceLetter(com.rostifar.scrabbleproject.ScrabbleLetter letterToReplace) {
    word.remove(getBlankLetter());
    word.add(word.indexOf(getBlankLetter()), letterToReplace);
}