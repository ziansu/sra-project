@java.lang.Override
public com.diary.calendar.domains.User getUserByUserId(final java.lang.Long userId) {
    com.diary.calendar.domains.User user = userRepository.findOne(userId);
    return user;
}