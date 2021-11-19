public static com.theratio.utilities.Post.CreatePostResult createPost(long userID, com.theratio.utilities.Post.TYPE postType, java.lang.String itemName, float worstPrice, java.lang.String description) {
    return com.theratio.utilities.Post.createPost(userID, postType, itemName, worstPrice, 0.0F, "");
}