@java.lang.Override
public void addDataListeningObject(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
    if (this.dataListenings.isEmpty()) {
        this.contactsDataManager.addObserver(this);
    }
    this.dataListenings.add(observer);
}