public void sortRecipes(java.util.Comparator<net.minecraft.item.ItemStack> comparator) {
    sortedRecipes.sort(comparator);
    updateRecipeList();
}