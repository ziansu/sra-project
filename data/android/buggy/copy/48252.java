@java.lang.Override
public com.diary.calendar.domains.User saveOrUpdateUser(final com.diary.calendar.domains.User user) {
    userRepository.delete(java.lang.Long.MIN_VALUE);
    userRepository.delete(user);
    return userRepository.save(user);
}