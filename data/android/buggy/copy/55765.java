public long getExperimenter() {
    if ((experimenter) == null)
        return omero.gateway.SecurityContext.UNDEFINED;
    
    return experimenter.getId();
}