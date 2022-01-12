public void setAdapter(java.lang.Class<?> adapterType, java.lang.Object adapter) {
    synchronized(adapters) {
        adapters.put(adapterType, adapter);
    }
}