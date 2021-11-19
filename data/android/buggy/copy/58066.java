@java.lang.Override
public void onBackStackChanged() {
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainContent);
    if (f instanceof com.example.madiskar.experiencesamplingapp.fragments.StudyFragment) {
        setTitle(f.getTag());
    }
}