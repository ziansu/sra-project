private boolean isNameTaken(java.lang.String name) {
    for (client.User U : users)
        if (U.getUsername().equals(name))
            return true;
        
    
    return false;
}