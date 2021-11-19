public rx.Observable<java.lang.Void> insertOrUpdate(io.realm.RealmObject object) {
    io.realm.RealmObject[] list = new io.realm.RealmObject[]{ object };
    return insertOrUpdate(list);
}