@java.lang.Override
public bad.robot.unicorn.Coordinate getCoordinateFrom(int x, int y) {
    return bad.robot.unicorn.Coordinate.coordinate(x, (7 - y));
}