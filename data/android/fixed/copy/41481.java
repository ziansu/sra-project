public void terminate() {
    finnished = true;
    if ((thread) != null) {
        thread.stopRun();
    }
    org.bukkit.Bukkit.broadcastMessage(((((org.bukkit.ChatColor.BOLD) + "") + (org.bukkit.ChatColor.RED)) + "RACE HAS BEEN TERMINATED!"));
}