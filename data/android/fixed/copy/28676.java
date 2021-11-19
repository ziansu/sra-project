public int update(java.util.List<T> newData) {
    data.addAll(newData);
    update(true);
    return data.size();
}