public void setNextBlindPos() {
    (blindPos)++;
    if (((blindPos) + 1) >= (blindsListPref.size())) {
        blindPos = 0;
    }
}