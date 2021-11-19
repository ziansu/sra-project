public int getUserLevel() {
    if ((user) == null) {
        return user.getUserLevel();
    }else {
        return 0;
    }
}