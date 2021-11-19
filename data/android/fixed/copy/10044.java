public static java.lang.String decodePasswordWithPrefix(java.lang.String encodedPasswordWithPrefix) {
    if (org.datacleaner.util.SecurityUtils.hasPrefix(encodedPasswordWithPrefix)) {
        return org.datacleaner.util.SecurityUtils.decodePassword(encodedPasswordWithPrefix.substring(org.datacleaner.util.SecurityUtils.PREFIX.length()));
    }else {
        return encodedPasswordWithPrefix;
    }
}