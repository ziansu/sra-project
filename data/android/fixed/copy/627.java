@java.lang.Override
public void onSuccess(java.lang.Object[] result) {
    S newResult = null;
    if ((onSuccess) != null) {
        newResult = onSuccess.invoke(result);
    }
    if (hasCallback()) {
        outerCallback.onSuccess(newResult);
    }
}