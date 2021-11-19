protected boolean tryIncrementSize() {
    return (size.updateAndGet(( x) -> x >= (limit) ? limit : x + 1)) >= (limit);
}