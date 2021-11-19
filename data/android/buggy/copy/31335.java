public T pop() {
    if (empty())
        return null;
    
    T elem = stack.get(top);
    (top)--;
    return elem;
}