public T poll() {
    return _data.remove(((_data.size()) - 1));
}