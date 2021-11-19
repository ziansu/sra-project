public static boolean isDay(org.bukkit.World world) {
    long time = world.getTime();
    return (time > 24000L) && (time < 13000L);
}