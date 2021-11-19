@java.lang.Override
public void nextStory(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sweets.rumandapp.StageSelectActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)));
    startActivity(intent);
    this.finish();
}