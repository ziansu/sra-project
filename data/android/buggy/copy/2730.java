@org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose
public void onClose(int statusCode, java.lang.String reason) {
    com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.removeSession(clientID);
    java.lang.System.out.println(((("Close: statusCode=" + statusCode) + ", reason=") + reason));
}