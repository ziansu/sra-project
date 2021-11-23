public static java.lang.String getDimension(org.bukkit.block.Biome b) {
    switch (b) {
        case HELL :
            return "nether";
        case VOID :
            return "end";
        default :
            return "overworld";
    }
}