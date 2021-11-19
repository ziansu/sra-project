private void initializeTown(com.palmergames.bukkit.towny.object.Town t) {
    if ((towns.get(t.getUID())) == null) {
        towns.put(t.getUID(), new java.util.ArrayList<java.lang.Integer>());
    }
}