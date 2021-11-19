private java.lang.String qualify(java.lang.String key) {
    return java.util.Optional.ofNullable(groupPrefix).map(( prefix) -> (prefix + (separator)) + key).orElse(key);
}