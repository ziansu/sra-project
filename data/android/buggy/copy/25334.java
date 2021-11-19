@java.lang.Override
public void init(org.newdawn.slick.GameContainer arg0) throws org.newdawn.slick.SlickException {
    estimator = new application.PositionEstimator();
    field = new draw.SimulationField(application.Run.width, application.Run.height, draw.Alliance.RED);
    robot = new draw.SimulationRobot(field, draw.Alliance.RED, estimator);
}