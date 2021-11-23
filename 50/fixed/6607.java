public static void buildHats() {
    for (cpw.mods.compactsolars.CompactSolarType typ : cpw.mods.compactsolars.CompactSolarType.values()) {
        typ.buildHat();
        if (net.minecraft.server.MinecraftServer.getServer().isDedicatedServer())
            continue;
        
        typ.buildItemRenders();
    }
}