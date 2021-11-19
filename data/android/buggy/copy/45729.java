@java.lang.Override
public int getRecipeWidth(net.minecraft.item.crafting.IRecipe recipe) {
    return recipe instanceof net.minecraftforge.oredict.ShapelessOreRecipe ? 3 : -1;
}