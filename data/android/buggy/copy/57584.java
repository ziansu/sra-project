@java.lang.Override
public boolean isConnectionHealthy() {
    return ((edu.wpi.first.wpilibj.Timer.getFPGATimestamp()) - (lastPacket.getRecieptTimestamp())) <= (healthyTimeThreshold);
}