@java.lang.Override
public java.util.List<org.traccar.web.shared.model.Device> getDevices() {
    org.traccar.web.shared.model.User user = getUser();
    java.util.List<org.traccar.web.shared.model.Device> devices = new java.util.LinkedList<org.traccar.web.shared.model.Device>();
    devices.addAll(user.getDevices());
    return devices;
}