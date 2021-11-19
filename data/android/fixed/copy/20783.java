public void showTestNotification(java.lang.String title, java.lang.String serverTime, java.lang.String prio) {
    manager.notify(new java.util.Random().nextInt(), getNotificationBuilder(title, serverTime, prio).build());
}