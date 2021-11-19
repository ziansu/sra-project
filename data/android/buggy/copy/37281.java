public java.lang.String getPlayerName() {
    if ((playerName) == null) {
        setPlayerName(com.Ben12345rocks.AdvancedCore.Utils.getInstance().getPlayerName(getUUID()));
    }
    return playerName;
}