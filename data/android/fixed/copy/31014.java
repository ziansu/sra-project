@java.lang.Override
public void onSuccess(T result) {
    S newResult = null;
    if ((onSuccess) != null) {
        newResult = onSuccess.invoke(result);
    }
    if (hasCallback()) {
        outerCallback.onSuccess(newResult);
    }
}