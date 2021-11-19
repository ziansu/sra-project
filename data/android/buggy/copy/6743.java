public long findUserIdByUsername(java.lang.String username) {
    return customerRepo.getUserID(username.toLowerCase());
}