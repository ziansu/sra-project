public void remove() {
    setUser(null);
    if ((getVirtualEdition().getMemberSet().size()) == 1)
        getVirtualEdition().remove();
    else
        setVirtualEdition(null);
    
    deleteDomainObject();
}