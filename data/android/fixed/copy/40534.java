@org.apache.felix.scr.annotations.Activate
protected void activate(org.osgi.service.component.ComponentContext ctx) {
    this.osgiComponentContext = ctx;
    if (this.isAuthor()) {
        this.registerAsEventHandler();
        if (this.hasNotifications()) {
            this.registerAsFilter();
        }
    }
}