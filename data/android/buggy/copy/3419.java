public int mark() {
    if (!(isMarked())) {
        marked = true;
        return 1;
    }
    return 0;
}