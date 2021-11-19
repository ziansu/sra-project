ru.spbau.mit.StringSetImpl.StringSetEntry addEntry(char letter, boolean isLastLetter) {
    ru.spbau.mit.StringSetImpl.StringSetEntry e = new ru.spbau.mit.StringSetImpl.StringSetEntry(this, isLastLetter);
    next.add(getIndex(letter), e);
    (numberOfSuccessors)++;
    return e;
}