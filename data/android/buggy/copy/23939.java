public boolean checkIfAlreadyFavorited(java.lang.String team) {
    java.util.Map<java.lang.String, ?> favoritedteams = preferences.getAll();
    if (favoritedteams.containsValue(team)) {
        return true;
    }
    return false;
}