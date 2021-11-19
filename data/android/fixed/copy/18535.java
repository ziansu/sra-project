public void togglePermHuD(org.bukkit.entity.Player p) {
    if (!(permUsers.contains(p))) {
        toggleAllOff(p);
        permUsers.add(p);
        com.palmergames.bukkit.towny.huds.PermHUD.toggleOn(p);
    }else
        toggleAllOff(p);
    
}