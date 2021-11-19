private void addBiome(net.minecraft.world.biome.Biome biome, int weight, net.minecraftforge.common.BiomeManager.BiomeType biomeType) {
    net.minecraftforge.common.BiomeManager.addBiome(biomeType, new net.minecraftforge.common.BiomeManager.BiomeEntry(biome, weight));
}