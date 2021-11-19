private void receiveIntent() {
    android.content.Intent intent = getIntent();
    articleId = intent.getStringExtra("ID_KEY");
    articleTitleExtra = intent.getStringExtra("TITLE_KEY");
    android.util.Log.i(martell.com.vice.ArticleActivity.TAG, ("onCreate: " + (articleId)));
}