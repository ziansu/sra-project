@java.lang.Override
public void onClick(android.view.View v) {
    htl_leonding.fiplyteam.fiply.trainingssession.FFeedback fFeedback = new htl_leonding.fiplyteam.fiply.trainingssession.FFeedback();
    fFeedback.setArguments(getArguments());
    displayFragment.displayTSFeedback(fFeedback, getFragmentManager());
}