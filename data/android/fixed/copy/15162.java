public void deleteRecipe(android.content.Context context, long id) {
    new com.example.caitlin.cookhelper.DatabaseHandler(context).deleteRecipe(id);
}