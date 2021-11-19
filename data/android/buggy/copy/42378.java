private void showGlobalContextActionBar() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    actionBar.setCustomView(getActivity().getLayoutInflater().inflate(R.layout.stockboo_action_bar, null));
}