private void init() {
    setOnClickListener(this);
    eventBus = new de.greenrobot.event.EventBus();
    eventBus.register(getContext());
}