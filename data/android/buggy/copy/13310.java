public void receiveEdits() {
    while (!(serverOperations.isEmpty())) {
        applyServerOperation();
    } 
}