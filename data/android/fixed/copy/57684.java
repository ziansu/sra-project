public com.lance.common.adapterview.adapter.base.ItemViewDelegateManager<T> addDelegate(com.lance.common.adapterview.adapter.base.ItemViewDelegate<T> delegate) {
    int viewType = delegates.size();
    if (delegate != null) {
        delegates.put(viewType, delegate);
    }
    return this;
}