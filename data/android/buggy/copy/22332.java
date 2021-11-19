@java.lang.Override
public void loadSettings(ccre.holders.TuningContext context) {
    this.nudge = context.getFloat("Auto Mode One Container Nudge +A", 5.0F);
    this.leftStrafeTime = context.getFloat("Auto Mode One Container Strafe Time +A", 0.0F);
    this.autoZoneDistance = context.getFloat("Auto Mode One Container Auto Zone Distance +A", 10.0F);
}