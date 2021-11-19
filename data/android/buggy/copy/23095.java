@java.lang.Override
public boolean isClosed() {
    if (super.isClosed())
        return true;
    
    com.orientechnologies.orient.client.remote.OStorageRemoteSession session = getCurrentSession();
    if (session == null)
        return false;
    
    return session.getAll().isEmpty();
}