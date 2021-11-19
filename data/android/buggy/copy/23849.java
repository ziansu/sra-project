public static void reset() {
    org.bukkit.Bukkit.resetRecipes();
    fr.tomcraft.unlimitedrecipes.RecipesManager.customRecipes = new java.util.ArrayList<fr.tomcraft.unlimitedrecipes.CustomRecipe>();
    fr.tomcraft.unlimitedrecipes.RecipesManager.customShapedCrafts = new java.util.ArrayList<java.util.Map<java.lang.Character, org.bukkit.inventory.ItemStack>>();
}