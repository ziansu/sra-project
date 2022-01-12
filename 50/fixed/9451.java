@java.lang.Override
public java.util.List<br.com.criativasoft.opendevice.core.model.Device> listAll() {
    java.util.List<br.com.criativasoft.opendevice.core.model.Device> devices = getCurrentDevices();
    if (devices == null)
        return new java.util.ArrayList<br.com.criativasoft.opendevice.core.model.Device>();
    
    return devices;
}