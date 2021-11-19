public boolean equalsHashedPassword(java.lang.String clearPassword) {
    return edu.hm.api.User.sha256HashValue(clearPassword).equals(getPassword());
}