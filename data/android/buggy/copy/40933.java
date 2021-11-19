@java.lang.Override
public void onStepSelected(org.jkarsten.bakingapp.bakingapp.data.Step step) {
    if (mView.isDualPane()) {
        checkVideoAvailability(mSteps[mPosition]);
        mView.showStep(step);
    }
}