@java.lang.Override
public void liked(com.like.LikeButton likeButton) {
    firebaseutils.setlike(offlinedata.Id);
    holder.favoriteButton.setLiked(true);
    android.widget.Toast.makeText(com.example.massa.luxvilla.adaptadores.adaptadorrvtodasoffline.ctx, offlinedata.Id, Toast.LENGTH_LONG).show();
}