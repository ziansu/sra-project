public int readChannel(int channel) {
    int msg = 0;
    try {
        msg = rc.readBroadcast(channel);
    } catch (battlecode.common.GameActionException e) {
    }
    return msg;
}