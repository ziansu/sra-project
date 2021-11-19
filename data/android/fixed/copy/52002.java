public int getNumberToBuy() {
    if ((mNumberNeeded) > (mNumberOwned)) {
        return ((mNumberNeeded) - (mNumberOwned)) + (mNumberAdditional);
    }else {
        return mNumberAdditional;
    }
}