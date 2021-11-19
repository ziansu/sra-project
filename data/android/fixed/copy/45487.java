@java.lang.Override
public com.hypersocket.realm.Principal getUniquePrincipalForRealm(java.lang.String username, com.hypersocket.realm.Realm realm, com.hypersocket.realm.PrincipalType... type) throws com.hypersocket.resource.ResourceNotFoundException {
    java.util.Collection<com.hypersocket.realm.Principal> found = principalRepository.getPrincpalsByName(username, realm, type);
    return selectPrincipal(found, username);
}