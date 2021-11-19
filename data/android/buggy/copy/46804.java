private void searchNext() {
    do {
        (_current)++;
    } while (((_current) < (size())) && (!(_set.get(_current))) );
}