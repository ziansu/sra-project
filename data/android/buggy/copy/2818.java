@java.lang.Override
public void onChange(io.realm.DynamicRealmObject result) {
    if (!(subscriber.isUnsubscribed())) {
        subscriber.onNext(object);
    }
}