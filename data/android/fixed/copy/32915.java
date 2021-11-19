public void sortRecipes(java.util.Comparator<net.minecraft.item.ItemStack> comparator) {
    java.util.Collections.sort(sortedRecipes, comparator);
    updateRecipeList();
}