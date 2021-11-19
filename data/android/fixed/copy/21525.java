private boolean isValidUuid(java.lang.String uuid) {
    return (uuid != null) && (java.util.regex.Pattern.matches("[[a-f]|[0-9]]{8}-[[a-f]|[0-9]]{4}-[[a-f]|[0-9]]{4}-[[a-f]|[0-9]]{4}-[[a-f]|[0-9]]{12}", uuid));
}