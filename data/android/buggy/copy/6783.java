@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstance) {
    super.onSaveInstanceState(savedInstance);
    if (((listData) != null) || (listData.isEmpty())) {
        savedInstance.putSerializable("HEADER", listData);
    }
}