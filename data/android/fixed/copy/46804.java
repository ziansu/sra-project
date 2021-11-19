private void searchNext() {
    do {
        (_current)++;
    } while (((_current) < (_set.size())) && (!(_set.get(_current))) );
}