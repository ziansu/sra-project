protected boolean tryIncrementSize() {
    return (size.updateAndGet(( x) -> x > (limit) ? x : x + 1)) > (limit);
}