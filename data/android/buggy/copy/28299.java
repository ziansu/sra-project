public T next() {
    if (hasNext()) {
        return queue.peek();
    }else {
        return null;
    }
}