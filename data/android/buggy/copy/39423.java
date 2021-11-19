@java.lang.Override
public void onLike() {
    liked = !(liked);
    setLikeDrawable();
    com.lupolupo.android.controllers.retrofit.LupolupoHTTPManager.getInstance().postLikeUnlike(episodeData.id, liked);
}