public uk.ac.herts.SmartLab.XBee.Device.Pin.Status GetDigital(uk.ac.herts.SmartLab.XBee.Device.Pin pin) {
    if (this.analog.containsKey(pin))
        return ((uk.ac.herts.SmartLab.XBee.Device.Pin.Status) (digital.get(pin)));
    
    return null;
}