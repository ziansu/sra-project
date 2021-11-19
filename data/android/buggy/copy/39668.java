public synchronized void onError(io.realm.ObjectServerError error) {
    currentState.onError(error);
    if ((errorHandler) != null) {
        errorHandler.onError(this.getUserSession(), error);
    }
}