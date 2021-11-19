public D peekFirst() {
    if (!(isEmpty())) {
        return ((D) (_front));
    }
    return null;
}