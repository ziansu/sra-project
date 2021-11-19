public static boolean isDay(org.bukkit.World world) {
    long time = world.getTime();
    return (time > 0L) && (time < 13000L);
}