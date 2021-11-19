@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initData();
    com.changhong.touying.activity.Utils.requireServerVolume(this);
    com.changhong.touying.activity.QuickQuireMessageUtil.getInstance().setFeedbackListener(this, this);
    initViews();
    initEvents();
}