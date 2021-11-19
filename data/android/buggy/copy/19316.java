@java.lang.Override
public void onClick(android.view.View view) {
    android.app.Dialog addPaymentDialog = new com.szymkowski.personaltrainercompanion.payments.AddPaymentDialog(this, this);
    addPaymentDialog.show();
    updateLastPayment();
    updateNumberOfTrainingsRemaining();
    floatingActionsMenu.collapse();
}