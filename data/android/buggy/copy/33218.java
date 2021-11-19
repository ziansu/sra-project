private void addGlobalConstituents(org.commonjava.aprox.model.core.Group group) {
    group.addConstituent(new org.commonjava.aprox.model.core.StoreKey(org.commonjava.aprox.model.core.StoreType.hosted, org.jboss.pnc.mavenrepositorymanager.RepositoryManagerDriver.SHARED_RELEASES_ID));
    group.addConstituent(new org.commonjava.aprox.model.core.StoreKey(org.commonjava.aprox.model.core.StoreType.hosted, org.jboss.pnc.mavenrepositorymanager.RepositoryManagerDriver.SHARED_IMPORTS_ID));
    group.addConstituent(new org.commonjava.aprox.model.core.StoreKey(org.commonjava.aprox.model.core.StoreType.group, org.jboss.pnc.mavenrepositorymanager.RepositoryManagerDriver.PUBLIC_GROUP_ID));
}