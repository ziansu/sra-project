public void setSpeed(double speed) {
    org.ingrahamrobotics.robot2015.output.Output.output(OutputLevel.RAW_MOTORS, "Indexer:Speed", speed);
}