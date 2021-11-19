public java.util.ArrayList<com.Ben12345rocks.AdvancedCore.sql.Column> getExact(java.lang.String uuid) {
    if (!(containsKey(uuid))) {
        loadPlayer(uuid);
    }
    return table.get(uuid);
}