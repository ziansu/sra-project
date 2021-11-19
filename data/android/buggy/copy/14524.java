public double moveCost(int reconfig_time, int nodes_before, int nodes_after) {
    return (reconfig_time * ((nodes_after + nodes_before) + 1)) / 2.0;
}