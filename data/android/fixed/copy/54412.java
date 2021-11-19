private void changed() {
    if (!(updating)) {
        items.onNext(java.util.Collections.unmodifiableList(new java.util.ArrayList<>(this)));
    }
}