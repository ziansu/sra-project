@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    com.example.whatsmymood.AddMoodController.processResult(requestCode, resultCode, intent);
}