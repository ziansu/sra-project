@javax.websocket.OnError
public void onErrorReceived(java.lang.Throwable t) {
    java.lang.System.out.println("onErrorReceived Called. Halting all motion. ");
    halt(null);
}