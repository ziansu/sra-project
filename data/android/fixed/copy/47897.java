private void autoCreate(int size) {
    while ((size()) < size) {
        add(mDefaultValue.newEntry());
    } 
}