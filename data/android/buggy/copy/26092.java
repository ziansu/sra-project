@java.lang.Override
public void run(java.lang.String... params) {
    presenter.isKeyPhraseCorrect(params[0]);
    closeWindow();
    presenter.afterNewKeyInput();
}