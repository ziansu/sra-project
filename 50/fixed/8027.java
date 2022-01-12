public void startWrittenTestMenuItemAction() {
    if ((mainView.getCurrentlySelectedVocabList()) == null) {
        reportNoVocabListSelectedError();
    }else {
        new com.tkomiya.views.WrittenTest(mainView.getCurrentlySelectedVocabList(), com.tkomiya.main.MainController.TESTING_LANGUAGE);
    }
}