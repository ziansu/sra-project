@java.lang.Override
public void onFeedbackSelected(org.eyeseetea.malariacare.database.model.Survey survey) {
    tabHost.setCurrentTabByTag(getResources().getString(R.string.tab_tag_improve));
    sentFragment.getView().setVisibility(View.GONE);
    initFeedback(survey, Constants.FRAGMENT_FEEDBACK_KEY);
}