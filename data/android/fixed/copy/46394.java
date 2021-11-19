public void add(java.lang.String key, int value) {
    java.lang.String jsonOrder = (("\"" + key) + "\":") + value;
    this.list.add(jsonOrder);
}