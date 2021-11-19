@java.lang.Override
public void onResume() {
    de.greenrobot.event.EventBus.getDefault().post(new com.ece.handshake.events.PresenterResumeEvent(com.ece.handshake.views.SMDialogFragment.PRESENTER_NAME));
    super.onResume();
}