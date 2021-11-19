@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mDisplayedConference) != null)
        outState.putString("conference", mDisplayedConference.getId());
    
}