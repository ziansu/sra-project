@java.lang.Override
public void onStop() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    com.example.chandan.contactmanagement.utility.SharedPreferenceHelper.putHashSet(attachedActivity.getContext(), deletedItems);
    super.onStop();
}