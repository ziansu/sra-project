public void merge(com.yahoo.validatar.common.Result result) {
    if (result != null) {
        data.putAll(result.data);
    }
}