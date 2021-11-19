public static void loadImageFromRemoteServerIntoImageView(android.content.Context context, java.lang.String imageURL, android.widget.ImageView imageView) {
    com.squareup.picasso.Picasso.with(context).load(imageURL).fit().into(imageView);
}