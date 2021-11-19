public void onFailure(org.eclipse.paho.client.mqttv3.IMqttToken asyncActionToken, java.lang.Throwable exception) {
    log(new java.lang.StringBuilder("Disconnect failed").append(exception).toString());
}