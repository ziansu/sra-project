public java.util.ArrayList<java.lang.Integer> getEnemyTowns(com.palmergames.bukkit.towny.object.Town t) {
    if (hasEnemies(t)) {
        return towns.get(t.getUID());
    }
    return null;
}