@java.lang.Override
public void attachView(com.matteoveroni.wordsremember.quizgame.view.QuizGameView view) {
    com.matteoveroni.wordsremember.quizgame.presenter.QuizGamePresenter.EVENT_BUS.register(this);
    this.model.reset();
    this.model.registerToEventBus();
    this.view = view;
    score = 0;
}