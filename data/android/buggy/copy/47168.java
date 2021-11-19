public com.example.robert.facebookrecipes.entities.Recipe getFirstRecipe() {
    com.example.robert.facebookrecipes.entities.Recipe first = null;
    if (!(recipes.isEmpty())) {
        recipes.get(0);
    }
    return first;
}