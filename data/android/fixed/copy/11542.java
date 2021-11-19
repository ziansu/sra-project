@java.lang.SuppressWarnings(value = "unused")
@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onOfflineSubscriptionPosted(no.dnt.sjekkut.event.OfflineSubscriptionPosted event) {
    fetchUserStats();
}