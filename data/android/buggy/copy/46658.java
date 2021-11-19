@java.lang.Override
public void run() {
    com.squareup.picasso.Picasso.with(getApplicationContext()).load(imageInfo.getUrl()).into(t);
    android.widget.Toast.makeText(this, "Wallpaper set", Toast.LENGTH_SHORT).show();
}