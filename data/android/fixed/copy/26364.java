private void initializeTown(com.palmergames.bukkit.towny.object.Town t) {
    if ((towns.get(t.getName())) == null) {
        towns.put(t.getName(), new java.util.ArrayList<java.lang.String>());
    }
}