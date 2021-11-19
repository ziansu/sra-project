@java.lang.Override
public void onFailure(org.eclipse.paho.client.mqttv3.IMqttToken arg0, java.lang.Throwable arg1) {
    this.theDispatcher.setConnected(false);
}