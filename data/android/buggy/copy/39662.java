@java.lang.SuppressWarnings(value = "CloneDoesntCallSuperClone")
@java.lang.Override
public com.pcloud.networking.api.MultiCall<T, R> clone() {
    return new com.pcloud.networking.api.ApiClientMultiCall(apiComposer, rawCall, responseAdapter, requests);
}