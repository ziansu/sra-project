public int pop() {
    final int result = innerPop();
    usedIndices.add(result);
    updateNumUnusedIndices();
    updateNumUsedIndices();
    return result;
}