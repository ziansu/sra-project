@java.lang.Override
public java.util.List<org.traccar.web.shared.model.Device> getDevices() {
    java.util.List<org.traccar.web.shared.model.Device> devices = new java.util.LinkedList<org.traccar.web.shared.model.Device>();
    org.traccar.web.shared.model.User user = getUser();
    devices.addAll(user.getDevices());
    return devices;
}