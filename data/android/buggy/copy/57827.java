public void onClick(android.view.View v) {
    android.content.Intent intent = getIntent();
    intent.putExtra("page", v.getId());
    setResult(Activity.RESULT_OK, intent);
    finish();
}