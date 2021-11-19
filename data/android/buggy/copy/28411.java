static void register(net.minecraft.item.ItemStack input, int ticks, net.minecraft.item.ItemStack... outputs) {
    techreborn.init.recipes.IndustrialCentrifugeRecipes.register(input, ticks, true, outputs);
}