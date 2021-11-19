public static japura.Tribes.Tribe getPlayersTribe(org.bukkit.entity.Player user) {
    if (user == null)
        return new japura.Tribes.Tribe("invalid tribe");
    
    return japura.Tribes.Tribes.getPlayersTribe(user.getName());
}