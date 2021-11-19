public java.lang.String get(java.lang.String path) {
    final com.eclipsesource.json.JsonValue value = this.values.get(this.pathToProperty(path));
    if (value == null) {
        return null;
    }
    return value.toString();
}