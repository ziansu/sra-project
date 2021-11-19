public java.lang.Object retrieve(java.lang.String id) {
    java.lang.ref.WeakReference<java.lang.Object> objectWeakReference = data.get(id);
    data.remove(id);
    return objectWeakReference.get();
}