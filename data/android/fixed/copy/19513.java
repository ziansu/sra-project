private boolean checkIfLivesLeft() {
    if ((mState.getLives()) <= 0) {
        return false;
    }
    return true;
}