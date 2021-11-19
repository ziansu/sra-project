@java.lang.Override
public void run() {
    org.bukkit.Bukkit.getPlayer(uuid).removeMetadata("wild.Cooldown", WildTP.instace);
}