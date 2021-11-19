public void removeWithTasks() {
    for (org.bukkit.scheduler.BukkitRunnable task : tasks)
        task.cancel();
    
    remove();
}