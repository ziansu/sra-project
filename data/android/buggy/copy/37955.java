@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i(com.xiaodong.dream.catcher.demo.express.ExpressFragment.TAG, ">>onCreate");
    mActivity = getActivity();
    setMainTitleListener = ((com.xiaodong.dream.catcher.demo.express.OnSetMainTitleListener) (mActivity));
    setMainTitleListener.onSetMainTitle(R.string.express_title);
}