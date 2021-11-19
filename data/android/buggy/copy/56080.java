@java.lang.Override
protected void onStart() {
    if (!(com.idgi.event.ApplicationBus.hasListener(this))) {
        java.lang.System.out.println("ADDED");
        com.idgi.event.ApplicationBus.register(this);
    }
    super.onStart();
}