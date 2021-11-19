private void updateEntryObservers() {
    for (int i = 0; i < (mEntries.size()); i++) {
        mEntries.valueAt(i).updateObserver();
    }
}