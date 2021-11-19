public void setAnswerShownResult() {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.akimov.android.geoquiz.CheatActivity.EXTRA_ANSWER_IS_SHOWN, isAnswerShown);
    setResult(com.akimov.android.geoquiz.RESULT_OK, data);
}