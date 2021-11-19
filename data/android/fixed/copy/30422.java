public final void reset() {
    for (int i = 0; i < (usedElements.size()); i++) {
        freeElements.add(usedElements.get(i));
    }
    usedElements.clear();
}