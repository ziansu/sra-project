private boolean shapeIsComplete(mygames.lineball.Balls.Ball b) {
    return !((b.equals(currentTrackedBall)) || ((b.equals(lastTrackedBall)) && ((ballsTracked.size()) > 2)));
}