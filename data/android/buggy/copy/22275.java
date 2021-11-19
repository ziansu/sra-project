public boolean isPresent(java.util.Properties properties) {
    return (properties.containsKey(_name)) && ((get(properties)) != null);
}