public void displayImage() {
    android.content.Intent intent = new android.content.Intent(this, com.example.jimmyklein.geosnap.ImageViewActivity.class);
    intent.putExtra("EXTRA_FILE_URI", fileUri.toString());
    startActivity(intent);
}