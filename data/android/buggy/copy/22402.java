public io.realm.RealmQuery<E> where() {
    realm.checkIfValid();
    if (!(syncToCheckIfValid("Calling where on RealmResults whose parent RealmList has been deleted already."))) {
        throw new java.lang.IllegalStateException("The RealmList which this RealmResults is created on has been deleted.");
    }
    return io.realm.RealmQuery.createQueryFromResult(this);
}