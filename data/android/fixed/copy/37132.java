@java.lang.Override
public void onCompleted() {
    sortByDate();
    getStatusKidModelObservable.subscribe(observer);
}