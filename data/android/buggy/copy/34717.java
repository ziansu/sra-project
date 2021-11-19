public boolean addUser(iFace.User u) {
    if ((getUserById(u.setId(id))) != null)
        return false;
    
    return m_users.add(u);
}