@java.lang.Override
public net.minecraft.item.crafting.IRecipe addRecipe() {
    return com.lothrazar.cyclicmagic.registry.RecipeRegistry.addShapedRecipe(new net.minecraft.item.ItemStack(this), " d ", "fdf", "ooo", 'o', Blocks.OBSIDIAN, 'f', Blocks.FURNACE, 'r', Blocks.DROPPER, 'd', Blocks.DIAMOND_BLOCK);
}