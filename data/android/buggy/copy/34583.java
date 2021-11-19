public void run() {
    if ((cz3002.dnp.Controller.NotificationCtrl.getInstance().getNotifications().size()) < 1) {
        cz3002.dnp.Controller.NotificationCtrl.getInstance().retrieveNotifications();
    }
}