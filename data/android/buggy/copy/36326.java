@java.lang.Override
public void run() {
    final android.content.Intent mainIntent = new android.content.Intent(this, com.sierisimo.idareyoutobeawesome.MainActivity.class);
    startActivity(mainIntent);
    finish();
}