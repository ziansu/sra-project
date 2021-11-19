@java.lang.Override
protected void onReset() {
    super.onReset();
    com.google.gwt.core.client.Scheduler.get().scheduleDeferred(new com.google.gwt.core.client.Scheduler.ScheduledCommand() {
        @java.lang.Override
        public void execute() {
            if (serverSelection.isSet())
                loadHostData();
            
        }
    });
}