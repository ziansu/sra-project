@java.lang.Override
public void arriveRobot(program.RobotBase rb) {
    program.Program.writeDebug(("arriveRobot (in NotRoad) - Robot: " + (rb.getId())));
    addToList(rb);
    rb.updateField(this);
    rb.die();
    removeFromList(rb);
}