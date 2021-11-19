@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.hyphenate.kefusdk.manager.main.LeaveMessageManager.getInstance().getProjectIds();
    loadFirstStatus();
    refreshAgentAvatar();
}