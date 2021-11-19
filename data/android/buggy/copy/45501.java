public boolean getNewVblank() {
    boolean returnData = newVblank;
    if (newVblank) {
        newVblank = false;
    }
    return returnData;
}