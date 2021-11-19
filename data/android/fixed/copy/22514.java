public void set(T value) {
    this.value = value;
    serializedSubject.onNext(this.value);
}