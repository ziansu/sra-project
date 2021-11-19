@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        questionListPresenter.handleDeepLinks(getIntent());
        questionListPresenter.loadQuestions();
    }
}