@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    mActivity = ((com.xhy.weibo.ui.activity.StatusDetailActivity) (context));
    mActivity.setmHandler(mHandler);
}