@java.lang.Override
void onDropView() {
    mSubscriptionList.unsubscribe();
    mSubscriptionList = null;
}