public void stopProgramming() throws de.root1.slicknx.KnxException {
    if (!(isProgramming)) {
        throw new java.lang.IllegalStateException("Not in programming-state- Call startProgramming() first.");
    }
    protocol.writeProgrammingMode(individualAddress, false);
    protocol.restart(individualAddress);
    isProgramming = false;
}