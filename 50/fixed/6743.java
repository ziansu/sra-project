public long findUserIdByUsername(java.lang.String username) {
    return customerRepo.findUserIdByUsername(username.toLowerCase());
}