public net.anomalyxii.werewolves.domain.Player findOrCreateUserOrSpecialPlayer(java.lang.String name, java.lang.String avatarUrl) {
    net.anomalyxii.werewolves.domain.Player player = findSpecialPlayer(name);
    if (player != null)
        return player;
    
    return findOrCreateUser(name, avatarUrl);
}