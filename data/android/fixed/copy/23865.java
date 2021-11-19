public void sortRecipes(java.util.Comparator<net.minecraft.item.ItemStack> comparator) {
    if ((currentSort) != comparator) {
        sortingChanged();
    }
    currentSort = comparator;
    java.util.Collections.sort(sortedRecipes, comparator);
    updateRecipeList();
    isRecipeListDirty = true;
}