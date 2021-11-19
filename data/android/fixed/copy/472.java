public T front() {
    return (this.store.getHead()) == null ? null : ((T) (this.store.getHead().getData()));
}