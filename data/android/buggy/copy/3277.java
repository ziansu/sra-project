private java.util.List<model.Player> getYouthFirstEleven() {
    int size = getYouthPlayers().size();
    if (size > 11) {
        return getSeniorPlayers().subList(0, 11);
    }else {
        return getSeniorPlayers();
    }
}