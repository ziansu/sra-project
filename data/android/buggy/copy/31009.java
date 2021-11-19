private void showAlertSwipeToDismissEnabled() {
    com.tapadoo.alerter.Alerter.create(this).setTitle("Alert Title").setText("Alert text...").enableSwipeToDismiss(true).show();
}