public boolean idAlreadyExists(java.lang.Integer id) {
    ie.dit.onedirectory.entities.User user = null;
    user = service.findByID(id);
    if (user != null) {
        return true;
    }else
        return false;
    
}