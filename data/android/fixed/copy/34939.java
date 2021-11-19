protected T extractObjectFromResults(io.realm.RealmResults<T> results) {
    return results.last(null);
}