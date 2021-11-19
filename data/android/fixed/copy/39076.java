private void storeFirst() {
    if ((first) != 0L) {
        putOperation(org.joml.Sequence.OPCODE_STORE_FIRST);
        putArg(first);
        putArg(0L);
        firstInSync = true;
    }
}