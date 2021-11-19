private void callback(boolean success) {
    if ((onComplete) != null) {
        if (success) {
            onComplete.onComplete();
        }else {
            onFail.onFail();
        }
    }
}