@java.lang.Override
public void onDeviceContextClosed(org.opendaylight.openflowplugin.api.openflow.device.DeviceContext deviceContext) {
    for (org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RoutedRpcRegistration<?> registration : rpcRegistrations) {
        registration.close();
    }
}