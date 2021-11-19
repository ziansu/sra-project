private boolean isUserAllowed(br.com.timezones.model.User user, final java.util.Set<java.lang.String> rolesSet) {
    return (user != null) && (rolesSet.contains(user.getProfile().name()));
}