public void start(edu.wpi.first.wpilibj.SerialPort serial_port) {
    m_thread = new java.lang.Thread(this);
    m_thread.start();
    stop = false;
}