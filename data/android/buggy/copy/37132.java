@java.lang.Override
public void onCompleted() {
    sortByDate();
    subscription = getStatusKidModelObservable.subscribe(observer);
}