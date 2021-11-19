protected void addFilter(com.raizlabs.android.coreutils.functions.Predicate<T> filter) {
    this.filters.addPredicate(true, filter);
    update();
}