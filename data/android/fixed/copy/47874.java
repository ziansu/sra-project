@java.lang.Override
public void onResume() {
    super.onResume();
    com.breadwallet.tools.adapter.MiddleViewAdapter.resetMiddleView(getActivity(), null);
    com.breadwallet.presenter.fragments.FragmentSettingsAll.refreshUI();
}