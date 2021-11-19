public synchronized boolean isLexicalFinishedWithouError() {
    return (mIsLexicalFinished) && ((mTokenBuffer.remainingCapacity()) == 0);
}