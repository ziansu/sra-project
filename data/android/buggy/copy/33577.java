private java.util.List<de.tum.in.foodforme.model.Recipe> getPopularRecipes(java.lang.Integer resultSize, java.lang.String course) {
    return recipeDAO.getPopularRecipes(resultSize, "");
}