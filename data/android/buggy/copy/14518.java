@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.book_another_search);
    android.content.Intent intent = getIntent();
    books = intent.getStringArrayListExtra("books");
    if ((books) == null) {
    }
}