private java.util.List<Argument> getAllSupporters() {
    return children.stream().filter(( u) -> u.isSupporter()).collect(java.util.stream.Collectors.toList());
}