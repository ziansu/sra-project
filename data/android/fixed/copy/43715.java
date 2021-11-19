public dev.blunch.blunch.domain.User createNewUser(dev.blunch.blunch.domain.User user) {
    return userRepository.update(user);
}