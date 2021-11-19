public void receiveEdits() {
    if (!(serverOperations.isEmpty())) {
        applyServerOperation();
    }
}