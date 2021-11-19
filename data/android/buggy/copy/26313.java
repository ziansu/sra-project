public com.tapadoo.alerter.Alerter enableSwipeToDismiss(final boolean swipeToDismiss) {
    if ((getAlert()) != null) {
        getAlert().enableSwipeToDismiss(swipeToDismiss);
    }
    return this;
}