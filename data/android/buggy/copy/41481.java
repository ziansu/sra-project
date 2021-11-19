public void terminate() {
    finnished = true;
    thread.stopRun();
    org.bukkit.Bukkit.broadcastMessage(((((org.bukkit.ChatColor.BOLD) + "") + (org.bukkit.ChatColor.RED)) + "RACE HAS BEEN TERMINATED!"));
}