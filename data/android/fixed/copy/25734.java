public void setNextBlindPos() {
    (blindPos)++;
    if ((blindPos) >= (blindsListPref.size())) {
        blindPos = 0;
    }
}