private java.util.List<br.com.criativasoft.opendevice.core.model.Device> getCurrentDevices() {
    java.util.List<br.com.criativasoft.opendevice.core.model.Device> devices = deviceMap.get(br.com.criativasoft.opendevice.core.TenantProvider.getCurrentID());
    return devices;
}