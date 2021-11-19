net.xmlizer.wordhierarchy.Word addChild(final java.lang.String theWord) {
    final net.xmlizer.wordhierarchy.Word newChild = new net.xmlizer.wordhierarchy.Word(theWord);
    addChild(newChild);
    return newChild;
}