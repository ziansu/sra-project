public int getWatitingTime(int simulatorTime) {
    return (simulatorTime - (this.arrivalTime)) - ((this.expectedTime) - (this.remainingTime));
}