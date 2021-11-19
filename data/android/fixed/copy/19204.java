@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((state) == null) {
        reloadState(ch.grze.frogment.activity.StateAwareFrogmentActivity.getIntent(), savedInstanceState);
    }
}