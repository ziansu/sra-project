public boolean isBeginningInstruction() {
    if ((predecessors.size()) == 0) {
        return false;
    }
    if ((predecessors.first().instructionIndex) == (-1)) {
        return true;
    }
    return false;
}