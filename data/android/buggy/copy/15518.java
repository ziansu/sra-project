@java.lang.Override
protected void deliverResponse(T response) {
    mListener.onResponse(response);
}