public double getDeltaR(competition.richmario.StateAction previous, float reward, competition.richmario.StateAction next) {
    double deltaR = shape.shape(previous, next, reward);
    deltaR -= getQ(previous);
    return deltaR;
}