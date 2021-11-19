public io.realm.RealmQuery<E> where() {
    realm.checkIfValid();
    return io.realm.RealmQuery.createQueryFromResult(this);
}