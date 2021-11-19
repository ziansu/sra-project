public org.springframework.social.instagram.api.PagedMediaList getRecentMedia(long userId) {
    return getRecentMedia(userId, 0, 0, 0, 0);
}