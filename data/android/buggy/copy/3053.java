net.xmlizer.wordhierarchy.Word addChild(final java.lang.String theWord) {
    if (theWord.equals(getWord())) {
        setComplete(true);
        return this;
    }
    final net.xmlizer.wordhierarchy.Word newChild = new net.xmlizer.wordhierarchy.Word(theWord);
    addChild(newChild);
    return newChild;
}