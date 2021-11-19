private boolean isMbusDeviceCoupled(final com.alliander.osgp.domain.core.entities.SmartMeter mbusDevice) {
    if ((mbusDevice.getChannel()) == null) {
        return false;
    }else {
        return true;
    }
}