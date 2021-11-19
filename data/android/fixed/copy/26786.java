@java.lang.Override
public void connectionLost(java.lang.Throwable cause) {
    broadcastException(java.util.UUID.randomUUID().toString(), new java.lang.Exception(cause));
}