@java.lang.Override
public void detachView() {
    mView = null;
    if (((subscription) != null) && (!(subscription.isUnsubscribed()))) {
        subscription.unsubscribe();
    }
}