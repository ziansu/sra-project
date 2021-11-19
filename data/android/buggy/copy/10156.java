public boolean acceptsPartOf(konstructs.api.Stack stack) {
    return ((stack.typeId) == (typeId)) && (!(isFull()));
}