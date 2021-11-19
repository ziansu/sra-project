public boolean isAlreadyExists(net.toracode.moviedb.entities.CustomList list, net.toracode.moviedb.entities.User user) {
    for (net.toracode.moviedb.entities.User u : list.getFollowerList()) {
        if (u.getUniqueId().equals(user.getUniqueId()))
            return true;
        
    }
    return false;
}