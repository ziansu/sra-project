private void push(clojure.lang.Keyword key, java.lang.Object value) {
    ensureCapacity();
    _stack[((_stackTop)++)] = key;
    ensureCapacity();
    _stack[((_stackTop)++)] = value;
}