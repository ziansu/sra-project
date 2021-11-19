public void onClick(android.view.View v) {
    android.content.Intent intent = getIntent();
    intent.putExtra("page", ((v.getId()) + 1));
    setResult(Activity.RESULT_OK, intent);
    finish();
}