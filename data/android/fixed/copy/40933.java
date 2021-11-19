@java.lang.Override
public void onStepSelected(org.jkarsten.bakingapp.bakingapp.data.Step step) {
    if (mView.isDualPane()) {
        checkVideoAvailability(step);
        mView.showStep(step);
    }
}