@java.lang.Override
public void connect() {
    clientId = null;
    disconnecting.set(false);
    super.connect();
}