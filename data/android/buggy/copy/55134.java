public boolean isEmpty() {
    return (queryDatabase().getCount()) <= 0;
}