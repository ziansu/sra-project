public int getWatitingTime(int simulatorTime) {
    if ((this.arrivalTime) > simulatorTime) {
        return 0;
    }
    return (simulatorTime - (this.arrivalTime)) - ((this.expectedTime) - (this.remainingTime));
}