@java.lang.Override
public void onBackButtonClicked() {
    if ((screenIndex) == 0) {
        view.cancelEdit();
    }else {
        view.showContestSubmissionPage((--(screenIndex)));
    }
}