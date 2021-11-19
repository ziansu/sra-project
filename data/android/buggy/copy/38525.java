@java.lang.Override
public shared.networking.transport.NetGame joinGame(int id, shared.definitions.CatanColor color) throws client.networking.ServerProxyException {
    if (!(userLoggedIn)) {
        throw new client.networking.ServerProxyException("JoinGame invalid when user not logged in");
    }
    userJoinedGame = true;
    return gameList.get(0);
}