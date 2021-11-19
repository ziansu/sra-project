public gitmad.bitter.model.User removeEnemy(java.lang.String userId) {
    if (enemies.remove(userId)) {
        gitmad.bitter.model.User user = userProvider.getUser(userId);
        return user;
    }else {
        throw new java.util.NoSuchElementException("No Such Enemy Exists");
    }
}