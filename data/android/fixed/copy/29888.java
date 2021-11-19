public void deferredDeleteByRef(com.googlecode.objectify.Ref<T> ref) {
    if (null != ref) {
        this.deferredDeleteByKey(ref.getKey());
    }
}