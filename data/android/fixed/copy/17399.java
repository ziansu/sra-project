@java.lang.Override
protected void onResume() {
    super.onResume();
    EventBus.INSTANCE.fire(new com.ciplogic.allelon.eventbus.events.RequestMediaPlayerStatusEvent());
}