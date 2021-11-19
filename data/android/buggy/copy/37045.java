@java.lang.Override
public void deInit() {
    if ((bukkitSchedulerID) > 0) {
        org.bukkit.Bukkit.getScheduler().cancelTask(bukkitSchedulerID);
        bukkitSchedulerID = -1;
    }
}