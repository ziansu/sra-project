public void addGroup(java.lang.String name, java.util.List<java.lang.String> worlds, org.bukkit.GameMode gamemode) {
    groups.put(name.toLowerCase(), new me.gnat008.perworldinventory.groups.Group(name, worlds, gamemode));
}