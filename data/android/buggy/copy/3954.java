public void serviceTracking(uk.co.rossbeazley.trackmytrain.android.wear.TrainViewModel trainViewModel) {
    if (isNotifing) {
        for (uk.co.rossbeazley.trackmytrain.android.wear.notification.WearNotificationService.WearNotification presenter : notificationPresenters) {
            this.trainViewModel = trainViewModel;
            presenter.show(this.trainViewModel);
        }
    }
}