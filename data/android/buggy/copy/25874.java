public void switchActivity() {
    android.util.Log.d("alex", "aex");
    android.content.Intent intent = new android.content.Intent(this, com.echopen.asso.echopen.ListImagesActivity.class);
    startActivity(intent);
}