public java.util.ArrayList<com.izik.recipebook.Recipe> setFavoriteRecipesByUserId(java.lang.String UserId) {
    java.util.ArrayList<com.izik.recipebook.Recipe> favorites = com.izik.recipebook.Model.instance(mContext).GetUserFavoriteRecipesById(UserId);
    mThumbIds = GetAllImagesFromArrayList(favorites);
    return favorites;
}