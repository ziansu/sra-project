@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    if (delegate != null) {
        delegate.completion(false);
    }
}