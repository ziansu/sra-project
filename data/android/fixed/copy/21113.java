public void setHealth(double value) {
    health.setContent(client.RobotFigure.hbSVG(value));
    health.setFill(client.RobotFigure.HB_END_COLOR.interpolate(client.RobotFigure.HB_START_COLOR, value));
}