public boolean reachable(courier.Station b) {
    return this.findAllReachableStations(new courier.Station("null", (-1), new sim.util.Int2D((-1), (-1)), map)).contains(b);
}