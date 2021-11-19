public double getFinalTime(us.ihmc.robotics.robotSide.RobotQuadrant key) {
    return (size(key)) == 0 ? 0 : get(key).get(((size(key)) - 1)).getTime();
}