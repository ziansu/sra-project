public void returnResult(java.lang.String pathToBook) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("result", pathToBook);
    setResult(ru.spbau.library.RESULT_OK, intent);
    finish();
}