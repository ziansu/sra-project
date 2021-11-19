public void addAllWords() {
    ListNode2 node = sentencesHead.getNext();
    while (node != null) {
        addSentenceWords(((java.lang.String) (node.getValue())));
        node = node.getNext();
    } 
}