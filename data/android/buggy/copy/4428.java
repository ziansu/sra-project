@java.lang.Override
public void detachView() {
    dataEntryView = null;
    if (((subscription) != null) && (!(subscription.isUnsubscribed()))) {
        subscription.unsubscribe();
        subscription = null;
    }
}