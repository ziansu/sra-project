@java.lang.Override
public void deregister(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
    this.dataListenings.remove(observer);
    if (this.dataListenings.isEmpty()) {
        this.contactsDataManager.deleteObserver(this);
    }
}