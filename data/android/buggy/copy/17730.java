public com.cybor.gamehorse.core.Horse getHorse(int playerId) {
    java.util.List<com.cybor.gamehorse.core.Horse> playerHistory = history.get(playerId);
    return playerHistory.get(playerHistory.size());
}