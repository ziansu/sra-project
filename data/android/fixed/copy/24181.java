private boolean freeIdExists() {
    for (boolean idFlag : threadsIdList) {
        if (!idFlag) {
            return true;
        }
    }
    return false;
}