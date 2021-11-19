private void incrementIndices(int index) {
    for (int i = index; i < (objectCount); i++) {
        list[(index + 1)] = list[index];
    }
}