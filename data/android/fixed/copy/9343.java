public void addToStart(java.lang.String message) {
    java.util.LinkedList<java.lang.String> tmp = new java.util.LinkedList<java.lang.String>();
    tmp.push(message);
    tmp.addAll(storedMessages);
    storedMessages = tmp;
}