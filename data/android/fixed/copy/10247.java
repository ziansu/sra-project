@java.lang.Override
public boolean equals(java.lang.Object user) {
    if (user instanceof de.mixedfx.network.rebuild.user.User)
        return this.getIdentifier().equals(((de.mixedfx.network.rebuild.user.User) (user)).getIdentifier());
    else
        return false;
    
}