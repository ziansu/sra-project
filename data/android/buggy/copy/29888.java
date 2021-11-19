public void deferredDeleteByRef(com.googlecode.objectify.Ref<T> ref) {
    if (null != ref) {
        deferredDeleteByKey(ref.getKey());
    }
}