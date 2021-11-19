@java.lang.Override
public synchronized java.util.List<org.eclipse.kura.channel.ChannelRecord> execute() throws org.eclipse.kura.internal.driver.ble.sensortag.ConnectionException {
    for (org.eclipse.kura.internal.driver.ble.sensortag.SensorTagDriver.SensorTagRequestInfo requestInfo : this.requestInfos) {
        runReadRequest(requestInfo);
    }
    return java.util.Collections.unmodifiableList(this.channelRecords);
}