public boolean validateWord(model.Word guess) {
    model.Word target = wordbank.gettargetWord();
    target.addAttempt();
    return target.equals(guess);
}