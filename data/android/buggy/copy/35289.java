private void backToHome() {
    android.content.Intent newIntent = new android.content.Intent();
    newIntent.setClass(this, com.glm.labs.diary.ememories.MainActivity.class);
    this.startActivity(newIntent);
    this.finish();
    java.lang.System.gc();
}