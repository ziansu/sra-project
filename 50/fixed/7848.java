@java.lang.Override
public void onSuccess(android.net.Uri uri) {
    com.squareup.picasso.Picasso.with(this).load(uri).fit().centerCrop().into(profileIcon);
}