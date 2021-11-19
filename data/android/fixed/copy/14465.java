@butterknife.OnClick(value = R.id.btn_finish_test)
public void finishTestOnClick(android.view.View view) {
    ((com.blackteam.testbox.ui.TestQuestionActivity) (getActivity())).finishTest();
}