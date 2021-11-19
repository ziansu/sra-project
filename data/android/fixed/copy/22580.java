public <T> void attachDataSource(java.util.List<T> list) {
    adapter = new org.angmarch.views.NiceSpinnerAdapter(getContext(), list, textColor, backgroundSelector);
    setAdapterInternal(adapter);
}