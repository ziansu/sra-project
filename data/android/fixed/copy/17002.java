public void setPreviousMap() {
    if ((selectedMap) == 0) {
        selectedMap = (mapNames.size()) - 1;
    }else {
        selectedMap = (selectedMap) - 1;
    }
}