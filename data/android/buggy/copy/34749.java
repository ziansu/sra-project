private void setEmailFieldRequired(java.lang.String required) {
    if (((enabled) != null) && ((enabled.length()) > 0)) {
        builder.setEmailFieldRequired(java.lang.Boolean.parseBoolean(enabled));
    }
}