public void favouriteRecipe(int data) {
    ca.uottawa.cookapp.Recipe favourite = ca.uottawa.cookapp.RecipeManager.getList().get(data);
    favourite.setIsFavourite(true);
    ca.uottawa.cookapp.FavouriteRecipeManager.updateFavourites();
}