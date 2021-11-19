private void receiveIntent() {
    android.content.Intent intent = getIntent();
    articleId = intent.getStringExtra("ID_KEY");
    articleTitleExtra = intent.getStringExtra("TITLE_KEY");
}