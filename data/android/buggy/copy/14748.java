public hu.elte.Signal<T> accumulate(java.util.function.BiFunction<T, T, T> function, T t) {
    this.setValue(function.apply(this.getValue(), t));
    this.change();
    return this;
}