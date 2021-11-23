@java.lang.Override
protected com.example.android.bakingapp.data.RecipeData doInBackground(java.lang.Void... voids) {
    com.example.android.bakingapp.data.RecipeData data = com.example.android.bakingapp.tools.NetworkUtils.fetch();
    updateRecipeData(data);
    return data;
}