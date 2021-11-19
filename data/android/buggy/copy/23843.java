public java.util.ArrayList<com.izik.recipebook.Recipe> setUserFavoriteRecipesByExpression(java.lang.String userId, java.lang.String expression) {
    java.util.ArrayList<com.izik.recipebook.Recipe> likeExpressionRecipes = com.izik.recipebook.Model.instance(resources, mContext).GetUserFavoriteRecipesByLikeExp(userId, expression);
    mThumbIds = GetAllImagesFromArrayList(likeExpressionRecipes);
    return likeExpressionRecipes;
}