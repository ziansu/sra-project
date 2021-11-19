void bindOnLocalThread() {
    if ((tlDocument.get()) == null) {
        tlDocument.set(document.copy());
    }
}