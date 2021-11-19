@java.lang.Override
public void deInit() {
    super.deInit();
    if ((bukkitSchedulerID) > 0) {
        org.bukkit.Bukkit.getScheduler().cancelTask(bukkitSchedulerID);
        bukkitSchedulerID = -1;
    }
}