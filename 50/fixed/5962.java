public Type peek() {
    if (isEmpty()) {
        throw new java.lang.NullPointerException();
    }
    return myTopNode.myItem;
}