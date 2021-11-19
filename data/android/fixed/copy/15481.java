private int plus1(int pc) {
    ++pc;
    if (pc >= (org.jeffpiazza.derby.serialport.PlaybackSerialPortWrapper.program.length)) {
        pc = 0;
    }
    return pc;
}