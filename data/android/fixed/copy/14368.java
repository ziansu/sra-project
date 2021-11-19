@java.lang.Override
public org.syncloud.redirect.UserResult createUser(java.lang.String email, java.lang.String password) {
    org.syncloud.redirect.UserResult result = service.createUser(email, password);
    if (!(result.hasError()))
        storage.save(result.user());
    
    return result;
}