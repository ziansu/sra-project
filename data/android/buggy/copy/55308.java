private void insert(seedu.address.logic.autocomplete.AutoCompletePossibilities entry) {
    cache.addFirst(entry);
    if ((cache.size) > (maxSize)) {
        cache.removeLast();
    }
}