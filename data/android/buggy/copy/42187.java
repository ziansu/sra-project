public void addPlayer(int int_authentication_code, java.lang.String gameId) throws IServer.GameIsFullException {
    ServerProxy.SINGLETON.addPlayer(int_authentication_code, gameId);
}