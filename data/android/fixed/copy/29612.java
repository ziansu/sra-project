public boolean add(int i) {
    if (!(contains(i))) {
        indexes.add(i);
        set.add(i);
        return true;
    }
    return false;
}