public int addToRemainingTime(int change) {
    if ((change + (remainingTime)) >= 0)
        this.remainingTime += change;
    
    return remainingTime;
}