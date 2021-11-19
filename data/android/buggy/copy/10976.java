public void onEvent(com.pindroid.event.AccountChangedEvent event) {
    this.username = event.getNewAccount();
    refresh();
}