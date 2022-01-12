public boolean subtractFuel(double volume) {
    if (volume <= 0)
        return false;
    
    if (((volumeRemaining) - volume) >= 0) {
        volumeRemaining -= volume;
        return true;
    }
    return false;
}