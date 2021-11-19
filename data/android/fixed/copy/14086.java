private void updateRecipeData(com.example.android.bakingapp.data.RecipeData data) {
    mRecipeData = data;
    if ((mDetailFragment) != null) {
        mDetailFragment.setRecipeData(mRecipeData);
    }
}