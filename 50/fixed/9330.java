@java.lang.Override
public rx.Observable<java.io.File> call(java.io.File file) {
    return (file.listFiles()) == null ? null : rx.Observable.from(file.listFiles());
}