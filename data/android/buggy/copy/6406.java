@org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect
public void onConnect(org.eclipse.jetty.websocket.api.Session session) {
    clientID = com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.addSessionToGroup("unsorted", session);
    java.lang.System.out.println(((("Connect: " + (session.getRemoteAddress().getAddress())) + " ID: ") + (clientID)));
}