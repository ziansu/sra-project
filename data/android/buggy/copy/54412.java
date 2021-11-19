private void changed() {
    if (!(updating)) {
        items.onNext(java.util.Collections.unmodifiableList(this));
    }
}