@java.lang.Override
public void onChange(RealmResults<io.realm.DynamicRealmObject> object) {
    if (!(subscriber.isUnsubscribed())) {
        subscriber.onNext(results);
    }
}