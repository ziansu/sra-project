@java.lang.Override
public void onStop() {
    super.onStop();
    cz.vspj.schrek.im.activity.MainActivity mainActivity = ((cz.vspj.schrek.im.activity.MainActivity) (getActivity()));
    mainActivity.showMenuIcon(true);
    android.support.v7.app.ActionBar actionBar = mainActivity.getSupportActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
}