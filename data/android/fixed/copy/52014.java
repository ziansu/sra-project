private void put(java.lang.Object value) {
    map.put(x.json.JsonMapParser.unquoted(key), value);
    key = null;
    this.value = null;
}