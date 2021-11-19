public T pop() {
    if (empty())
        return null;
    
    T elem = stack.remove(top);
    (top)--;
    return elem;
}