public java.util.ArrayList<com.izik.recipebook.Recipe> setRecipesBy(java.lang.String likeExpression, boolean findThisUserRecipes) {
    java.util.ArrayList<com.izik.recipebook.Recipe> likeExpressionRecipes = com.izik.recipebook.Model.instance(resources, mContext).GetAllUsersRecipesByLikeExp(likeExpression, findThisUserRecipes);
    mThumbIds = GetAllImagesFromArrayList(likeExpressionRecipes);
    return likeExpressionRecipes;
}