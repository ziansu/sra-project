@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle state) {
    super.onRestoreInstanceState(state);
    recipe = state.getParcelable(com.example.floating.bakingapp.ui.RecipeListActivity.RECIPE_LIST);
    com.example.floating.bakingapp.ui.RecipeListActivity.ingredientsList = recipe.getIngredients();
    stepsListState = state.getParcelable(com.example.floating.bakingapp.ui.RecipeListActivity.STEPS_LIST_KEY);
}