public static com.baronhub.titan.project.common.enums.Permission getProfileType(java.lang.String perm) {
    if (perm.equals(com.baronhub.titan.project.common.enums.Permission.ADMIN.toString()))
        return com.baronhub.titan.project.common.enums.Permission.ADMIN;
    
    return com.baronhub.titan.project.common.enums.Permission.USER;
}