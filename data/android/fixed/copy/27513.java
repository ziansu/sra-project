private com.google.gwt.user.client.ui.MenuItem createViewMenuItem(final int type) {
    return org.rstudio.studio.client.common.ImageMenuItem.create(imageOfViewType(type), nameOfViewType(type), new com.google.gwt.core.client.Scheduler.ScheduledCommand() {
        @java.lang.Override
        public void execute() {
            setObjectDisplayType(type);
        }
    }, (-1));
}