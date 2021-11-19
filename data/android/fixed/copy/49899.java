public double getAngleInDegree(piekie.sensors.domain.Point currentPosition) {
    return (180 - (angleInside)) - (piekie.sensors.util.MathUtils.getAngleBetweenPoints(currentPosition, new piekie.sensors.domain.Point(cx, cy)));
}