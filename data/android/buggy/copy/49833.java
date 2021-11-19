public boolean isMatch(org.hibernate.dialect.Dialect dialect) {
    return !(dialect.useFollowOnLocking(null));
}