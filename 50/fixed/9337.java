@java.lang.Override
public java.lang.String getPassword() {
    if ((user) == null)
        return null;
    
    return user.getPassword().getValue();
}