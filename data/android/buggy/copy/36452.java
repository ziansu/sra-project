@java.lang.Override
public void initRequestHandler() {
    addRequestHandler(SystemNetworkConstant.COMMAND_USER_JOIN_ROOM, new com.creants.pluto.handler.JoinRoomRequestHandler());
    addRequestHandler(GameCommand.ACTION_AUTO_ARRANGE, new com.creants.pluto.handler.AutoArrangeRequestHandler());
    addRequestHandler(GameCommand.ACTION_FINISH, new com.creants.pluto.handler.FinishRequestHandler());
    addRequestHandler(SystemNetworkConstant.COMMAND_USER_DISCONNECT, new com.creants.pluto.handler.UserDisconnectHandler());
}