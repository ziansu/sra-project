@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        if (!(questionListPresenter.handleDeepLinks(getIntent()))) {
            questionListPresenter.loadQuestions();
        }
    }
}