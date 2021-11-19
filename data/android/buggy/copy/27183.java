@java.lang.Override
public boolean done() {
    return (Robot.sensors.getEncoder10Distance()) > (org.usfirst.frc1719.autonomous.GetInZone.DISTANCE);
}