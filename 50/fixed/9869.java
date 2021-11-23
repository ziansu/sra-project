public static java.lang.String getBiomeName(net.minecraft.world.biome.BiomeGenBase biome) {
    return (biome == null) || ((biome.biomeName) == null) ? "null" : biome.biomeName.toLowerCase();
}