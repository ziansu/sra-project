public java.util.ArrayList<java.lang.String> getEnemyTowns(com.palmergames.bukkit.towny.object.Town t) {
    if (hasEnemies(t)) {
        return towns.get(t.getName());
    }
    return null;
}