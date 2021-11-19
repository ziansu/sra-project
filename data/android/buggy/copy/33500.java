public static void delay(java.lang.Runnable runnable, eu.matejkormuth.rpgdavid.starving.Time delay) {
    org.bukkit.Bukkit.getScheduler().scheduleSyncDelayedTask(eu.matejkormuth.rpgdavid.starving.Starving.getInstance().getPlugin(), runnable, delay.toLongTicks());
}