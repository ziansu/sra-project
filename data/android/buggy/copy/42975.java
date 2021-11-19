private void workoutComplete() {
    android.os.Bundle data = getIntent().getExtras();
    boolean isSaved = data.getBoolean("isSaved");
    if (!isSaved)
        timeTextView.setText("0");
    
    title.setText("YOU'RE DONE!");
}