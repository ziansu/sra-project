private void updateRecipeData(com.example.android.bakingapp.data.RecipeData collection) {
    mRecipeData = collection;
    if ((mDetailFragment) != null) {
        mDetailFragment.setRecipeData(mRecipeData);
    }
}