private void fotaDevice(java.lang.String ep_name, java.lang.String fota_manifest, java.lang.String passphrase) {
    this.dispatchDeviceManagementAction(ep_name, com.arm.iot.event.hub.responder.IoTEventHubResponder.dm_fota_action_resource_uri, fota_manifest, "put");
    this.dispatchDeviceManagementAction(ep_name, com.arm.iot.event.hub.responder.IoTEventHubResponder.dm_fota_action_resource_uri, passphrase);
}