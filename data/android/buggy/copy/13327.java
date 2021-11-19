public int checkLeader() {
    if ((preparatorLead.size()) == (playerSize())) {
        return makeLeader();
    }
    return -1;
}