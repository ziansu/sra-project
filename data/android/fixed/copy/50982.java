@java.lang.Override
protected boolean consumeLoop() {
    setCurrentOffset(_consumeOffsets.remove());
    terminateLoopIfNecessary();
    return true;
}