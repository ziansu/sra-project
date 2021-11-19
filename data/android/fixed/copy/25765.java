private boolean validate() {
    if (getPickedPlayersFromAdapter().isEmpty()) {
        return false;
    }
    return true;
}