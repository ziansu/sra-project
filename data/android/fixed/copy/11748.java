public static void adminAuthorization(java.lang.String groups) {
    if ((org.springframework.util.StringUtils.isEmpty(groups)) || (!(groups.contains("admin")))) {
        throw new com.lifeix.football.common.exception.AuthorizationException();
    }
}