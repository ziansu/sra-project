public boolean checkEmail(java.lang.String email) {
    for (com.codecool.sherwoodbet.Model.User user : userRepository.findAll()) {
        if (user.getEmail().equals(email)) {
            return false;
        }
    }
    return true;
}