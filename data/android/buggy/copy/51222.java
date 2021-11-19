public void clear() {
    if ((data) != null) {
        data.clear();
        data = null;
    }
    notifyAllDataChanged();
}