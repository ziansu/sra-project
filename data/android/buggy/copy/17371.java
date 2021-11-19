@javax.websocket.OnMessage
public void onMessage(java.lang.String message, javax.websocket.Session userSession) {
    java.lang.System.out.println(("MessageReceived : " + message));
    ro.develbox.commands.Command command = serverProtocol.getCommandConstructor().constructCommand(message);
    super.onReceiveCommand(command);
}