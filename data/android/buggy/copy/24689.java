@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    com.techfly.liutaitai.util.Utility.getScreenSize(activity);
    mActivity = ((com.techfly.liutaitai.util.activities.CitySelectActivity) (activity));
    mIsFromMainActivity = mActivity.getIntent().getBooleanExtra(IntentBundleKey.REDIRECT_TYPE, false);
}