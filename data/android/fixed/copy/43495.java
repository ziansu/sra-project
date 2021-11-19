private double solomonCost(double currLevel, double newLevel) {
    double cost = 0.0;
    for (double n = currLevel; n < newLevel; n++) {
        cost += java.lang.Math.pow(n, 1.5);
    }
    return cost;
}