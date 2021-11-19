public int getSensorStateInt() {
    if (this.isSensorReply()) {
        return this.myRegex.equals(DCCppConstants.SENSOR_ACTIVE_REPLY_REGEX) ? 1 : 0;
    }else
        jmri.jmrix.dccpp.DCCppReply.log.error("SensorReply Parser called on non-SensorReply message type {}", this.getOpCodeChar());
    
    return 0;
}