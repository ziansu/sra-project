public synchronized void removeUser(com.hula.ihor.domain.User user) {
    com.hula.ihor.domain.Place placeOfUser = findPlaceOfUser(user);
    synchronized(this) {
        if (placeOfUser != null) {
            placeOfUser.setUser(null);
            return ;
        }
    }
    throw new com.hula.ihor.exception.UserNotFoundException();
}