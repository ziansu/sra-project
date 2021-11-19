public data.User findUserByUsername(java.lang.String username) {
    java.util.List<data.User> results = super.find("findUserByUsername", "username", username);
    if (!(results.isEmpty())) {
        return results.get(0);
    }
    return null;
}