@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, "onActivityCreated");
    initAdapter();
    initListView();
}