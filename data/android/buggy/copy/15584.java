public rstead.bgoff.mshultz.therecipebook.Recipe createRecipe() {
    setProps();
    return new rstead.bgoff.mshultz.therecipebook.Recipe(name, imageLink, ingredients, directions, notes);
}