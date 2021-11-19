public boolean DisconnectDevices(networkmodeling.core.NetworkGraphNode dev1, networkmodeling.core.NetworkGraphNode dev2) {
    return (model.DisconnectDevices(dev1.getNodeDevice(), dev2.getNodeDevice())) && (graph.DisconnectDevices(dev1, dev2));
}