public void setSpeed(double speed) {
    spoolMotor.set((-speed));
    org.ingrahamrobotics.robot2015.output.Output.output(OutputLevel.RAW_MOTORS, "Indexer:Speed", speed);
}