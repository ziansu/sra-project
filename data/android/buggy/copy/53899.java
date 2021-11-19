public void start(double time) {
    this.onRoute = true;
    this.startTime = time;
    for (ru.ngtu.vst.sim.Passenger passenger : this.passengers) {
        passenger.startDrive(time);
    }
}