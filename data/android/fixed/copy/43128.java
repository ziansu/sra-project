@java.lang.Override
public void run() {
    connection = openConnection();
    if ((connection) != null) {
        setState(ConnectionState.Connected);
    }else {
        setState(ConnectionState.Failed);
    }
}