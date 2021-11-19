@java.lang.Override
public void setTimeout(int time) {
    super.setTimeout(time);
    commPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, timeout, 0);
}