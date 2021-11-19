@java.lang.Override
protected void onProgressUpdate(io.evercam.network.discovery.DiscoveredCamera... discoveredCameras) {
    getScanActivity().addNewCameraToResultList(discoveredCameras[0]);
}