public int getNeededMaterialCount(net.minecraft.item.ItemStack material) {
    for (net.einsteinsci.betterbeginnings.register.recipe.OreRecipeElement stack : addedMaterials) {
        if (stack.matches(material)) {
            return stack.stackSize;
        }
    }
    return 0;
}