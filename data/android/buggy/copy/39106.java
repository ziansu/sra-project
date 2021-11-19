private void removeCookingComments() {
    java.lang.String key = "cookingComments";
    android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.remove(key);
    editor.commit();
}