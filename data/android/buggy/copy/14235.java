@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mainActivity = ((net.hadifar.dope.ui.activity.MainActivity) (getActivity()));
    getFragmentManager().addOnBackStackChangedListener(this);
    setRetainInstance(true);
    shouldDisplayHomeUp();
}