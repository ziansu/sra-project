private void dispose(io.reactivex.disposables.Disposable disposable) {
    if ((disposable != null) && (!(disposable.isDisposed()))) {
        disposable.dispose();
    }
}