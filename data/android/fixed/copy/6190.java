@java.lang.Override
public synchronized void enable() {
    m_initTime = edu.wpi.first.wpilibj.Timer.getFPGATimestamp();
    m_enabled = true;
    if ((table) != null) {
        table.putBoolean("enabled", true);
    }
}