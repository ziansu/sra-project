@java.lang.Override
public void teleopInit() {
    com.explodingbacon.bcnlib.event.EventHandler.fireEvent(new com.explodingbacon.bcnlib.event.TeleopStartEvent(this));
    for (com.explodingbacon.bcnlib.actuators.Motor m : com.explodingbacon.bcnlib.actuators.Motor.getAllMotors()) {
        if (m.isTuning())
            m.stopTuning();
        
    }
}