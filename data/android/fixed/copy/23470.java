@java.lang.Override
public void setYawPitchRoll(com.kauailabs.navx.IMUProtocol.YPRUpdate ypr_update) {
    this.yaw = ypr_update.yaw;
    this.pitch = ypr_update.pitch;
    this.roll = ypr_update.roll;
    this.compass_heading = ypr_update.compass_heading;
}