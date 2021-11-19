private void attemptToAdd(java.lang.Object stack) {
    if (passesFilters(stack)) {
        if (!(sorted.contains(stack))) {
            sorted.add(stack);
        }
    }
}