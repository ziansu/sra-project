@java.lang.Override
public void autonomousInit() {
    com.explodingbacon.bcnlib.event.EventHandler.fireEvent(new com.explodingbacon.bcnlib.event.AutonomousStartEvent(this));
}