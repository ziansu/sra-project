public void jump() {
    update();
    program.Program.writeDebug(("jump (in RobotBase), id: " + (id)));
    container.processRobot(this);
}